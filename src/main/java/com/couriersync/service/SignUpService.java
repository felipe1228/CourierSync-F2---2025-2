package com.couriersync.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.couriersync.dto.UsuarioRegistroDTO;
import com.couriersync.entity.Usuario;
import com.couriersync.repository.UsuarioRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Service
public class SignUpService {
	private final UsuarioRepository usuarioRepository;

	@Autowired
	public SignUpService(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}

	public Usuario registrarUsuario(UsuarioRegistroDTO dto) {
		Usuario usuario = new Usuario();
		usuario.setCedula(dto.getCedula());
		usuario.setNombre(dto.getNombre());
		usuario.setApellido(dto.getApellido());
		usuario.setEmail(dto.getEmail());
		usuario.setCelular(dto.getCelular());
		// Encriptar la contraseña antes de guardar
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		usuario.setContraseña(encoder.encode(dto.getContraseña()));
		usuario.setRol(dto.getRol());
		return usuarioRepository.save(usuario);
	}
}
