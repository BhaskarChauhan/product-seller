package com.aspv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import com.aspv.model.Purchase;
import com.aspv.security.UserPrinciple;
import com.aspv.service.PurchaseService;

/**
 * @author sa
 * @date 18.12.2021
 * @time 16:14
 */
@RestController
@RequestMapping("api/purchase")
public class PurchaseController
{
    @Autowired
    private PurchaseService purchaseService;


    @PostMapping
    public ResponseEntity<?> savePurchase(@RequestBody Purchase purchase)
    {
        return new ResponseEntity<>(purchaseService.savePurchase(purchase), HttpStatus.CREATED);
    }

    @GetMapping 
    public ResponseEntity<?> getAllPurchasesOfUser(@AuthenticationPrincipal UserPrinciple userPrinciple)
    {
        return ResponseEntity.ok(purchaseService.findPurchaseItemsOfUser(userPrinciple.getId()));
    }
}
