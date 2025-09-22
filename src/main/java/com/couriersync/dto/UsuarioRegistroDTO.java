package com.couriersync.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class UsuarioRegistroDTO {

    @NotBlank
    private String cedula;
    @NotBlank
    private String nombre;
    @NotBlank
    private String apellido;
    @NotBlank
    private String email;
    @NotBlank
    private String celular;
    @NotBlank
    private String contraseña;
    @NotBlank
    private String confirmarContraseña;
    @NotNull
    private int rol;

    // Getters y Setters
    
    public String getCedula() { return cedula; }
    public void setCedula(String cedula) { this.cedula = cedula; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getCelular() { return celular; }
    public void setCelular(String celular) { this.celular = celular; }
    public String getContraseña() { return contraseña; }
    public String getConfirmarContraseña() { return confirmarContraseña; }
    public void setConfirmarContraseña(String confirmarContraseña) { this.confirmarContraseña = confirmarContraseña; }
    public void setContraseña(String contraseña) { this.contraseña = contraseña; }
    public int getRol() { return rol; }
    public void setRol(int rol) { this.rol = rol; }
}
