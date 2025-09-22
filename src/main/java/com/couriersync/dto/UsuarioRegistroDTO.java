package com.couriersync.dto;

public class UsuarioRegistroDTO {
    private String cedula;
    private String nombre;
    private String apellido;
    private String email;
    private String celular;
    private String contraseña;
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
    public void setContraseña(String contraseña) { this.contraseña = contraseña; }
    public int getRol() { return rol; }
    public void setRol(int rol) { this.rol = rol; }
}
