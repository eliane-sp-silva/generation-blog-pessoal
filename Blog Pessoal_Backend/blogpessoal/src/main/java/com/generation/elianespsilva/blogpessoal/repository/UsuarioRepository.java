package com.generation.elianespsilva.blogpessoal.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.elianespsilva.blogpessoal.model.Usuario;
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	public Optional<Usuario> findByUsuario(String usuario);
	//No MySQL -> SELECT * FROM tb_usuario WHERE usuario = "usuario";
	
}
