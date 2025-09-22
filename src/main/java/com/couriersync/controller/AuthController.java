package com.couriersync.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.couriersync.entity.Usuario;
import com.couriersync.repository.UsuarioRepository;
import com.couriersync.service.AuthService;


@RestController
@CrossOrigin(origins = "http://localhost:8080", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE, RequestMethod.PATCH}, allowedHeaders = "*", allowCredentials = "true")
public class AuthController {
    
    private final AuthService authService;

    @Autowired
    public AuthController(AuthService authService, UsuarioRepository usuarioRepository) {
        this.authService = authService;
    }

    @GetMapping("/user")
    public Usuario getMethodName(@RequestParam String cedula) {
        return authService.findByCedula(cedula);
    }

   @PostMapping("/login")
    public String login(@RequestParam String cedula,
                        @RequestParam String contraseña,
                        @RequestParam Integer rol) {
        boolean success = authService.authenticate(cedula, contraseña, rol);
        return success ? "Login successful" : "Invalid credentials";
    }
}
