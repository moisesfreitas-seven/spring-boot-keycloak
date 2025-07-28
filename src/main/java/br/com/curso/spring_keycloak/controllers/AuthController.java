package br.com.curso.spring_keycloak.controllers;

import br.com.curso.spring_keycloak.components.HttpComponent;
import br.com.curso.spring_keycloak.models.User;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    private String keycloakServerUrl;

    private String realm;

    private String clientId;

    private String clientSecret;

    private String grantType;

    @Autowired
    private HttpComponent httpComponent;

    @PostMapping("/login")
    public ResponseEntity<?> login(@Valid @RequestBody User user) {
        return ResponseEntity.ok(user);
    }



}
