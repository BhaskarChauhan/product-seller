package com.aspv.service;

import com.aspv.model.User;

public interface AuthenticationService
{
    User signInAndReturnJWT(User signInRequest);
}
