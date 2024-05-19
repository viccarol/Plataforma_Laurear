package com.laurear.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laurear.login.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{}

