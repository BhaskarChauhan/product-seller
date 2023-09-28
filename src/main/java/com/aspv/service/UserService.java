package com.aspv.service;

import java.util.Optional;

import com.aspv.model.Role;
import com.aspv.model.User;

public interface UserService
{
    User saveUser(User user);

    Optional<User> findByUsername(String username);

    void changeRole(Role newRole, String username);
}
