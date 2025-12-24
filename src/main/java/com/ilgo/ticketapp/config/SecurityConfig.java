package com.ilgo.ticketapp.config;

import org.springframework.stereotype.Component;


@Component
public class SecurityConfig {

    public boolean validateUser(String username, String password) {
        return "admin".equals(username) && "1234".equals(password);
    }

    public boolean validateToken(String token) {
        return token != null && "ILGO-TOKEN".equals(token);
    }
}

