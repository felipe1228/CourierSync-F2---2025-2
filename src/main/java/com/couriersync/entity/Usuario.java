package com.couriersync.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tbl_usuarios")
@Data
public class Usuario {

    @Id
    private String cedula;

    @Column(name = "usuario", nullable = false)
    private String usuario;

    @Column(name = "nombres", nullable = false, unique = true)
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
    // Getters y Setters generados por Lombok
}
