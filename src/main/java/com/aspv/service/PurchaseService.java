package com.aspv.service;


import java.util.List;

import com.aspv.model.Purchase;
import com.aspv.repository.projection.PurchaseItem;

public interface PurchaseService
{
    Purchase savePurchase(Purchase purchase);

    List<PurchaseItem> findPurchaseItemsOfUser(Long userId);
}
