package com.generation.elianespsilva.blogpessoal.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.elianespsilva.blogpessoal.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	public Optional<Usuario> findByUsuario(String usuario);
	//No MySQL -> SELECT * FROM tb_usuario WHERE usuario = "usuario";
	
}
