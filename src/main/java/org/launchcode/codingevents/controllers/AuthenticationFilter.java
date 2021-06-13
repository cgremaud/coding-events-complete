package org.launchcode.codingevents.controllers;

import org.launchcode.codingevents.data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class AuthenticationFilter {
    @Autowired
    UserRepository userRepository;

    @Autowired
    AuthenticationController authenticationController;
}
