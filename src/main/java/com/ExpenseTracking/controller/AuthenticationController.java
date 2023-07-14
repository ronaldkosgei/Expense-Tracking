package com.ExpenseTracking.controller;

import com.ExpenseTracking.auth.AuthenticationRequest;
import com.ExpenseTracking.auth.AuthenticationResponse;
import com.ExpenseTracking.auth.RegisterRequest;
import com.ExpenseTracking.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService authenticationService;


    @PostMapping("/register")
    public AuthenticationResponse register(
            @RequestBody RegisterRequest registerRequest) {
        return authenticationService.register(registerRequest);
    }

    @PostMapping("/authenticate")
    public AuthenticationResponse authenticate(
            @RequestBody AuthenticationRequest authenticationRequest) {
        return authenticationService.authenticate(authenticationRequest);
    }

}
