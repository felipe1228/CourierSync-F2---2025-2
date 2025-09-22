package com.couriersync.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.couriersync.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    Usuario findByCedula(String cedula); 
    boolean existsByCedula(String cedula);
    boolean existsByUsuario(String usuario);
}
