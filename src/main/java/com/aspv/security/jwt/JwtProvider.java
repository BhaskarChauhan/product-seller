package com.aspv.security.jwt;

import org.springframework.security.core.Authentication;

import com.aspv.security.UserPrinciple;

import javax.servlet.http.HttpServletRequest;

public interface JwtProvider
{
    String generateToken(UserPrinciple auth);

    Authentication getAuthentication(HttpServletRequest request);

    boolean isTokenValid(HttpServletRequest request);
}
