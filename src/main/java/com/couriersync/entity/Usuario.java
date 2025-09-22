package com.couriersync.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_usuarios")
public class Usuario {

    @Id
    private String cedula;

    @Column(name = "nombres", nullable = false)
    private String nombre;

    @Column(name = "apellidos", nullable = false)
    private String apellido;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "celular", nullable = false, unique = true)
    private String celular;

    @Column(name = "contraseña", nullable = false)
    private String contraseña;

    @Column(name = "rol", nullable = false)
    private int rol;

    // Getters y Setters
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }
}
