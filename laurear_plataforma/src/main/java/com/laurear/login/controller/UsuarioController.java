package com.laurear.login.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.laurear.login.model.Usuario;
import com.laurear.login.repository.UsuarioRepository;

@RestController
public class UsuarioController {
	
	@Autowired
	UsuarioRepository repository;
	
	@GetMapping("/usuarios")
	public ModelAndView getUsuarios() {
		ModelAndView modelAndView = new ModelAndView("usuarios_cadastrados.html");
		List<Usuario> usuarios = repository.findAll();
		modelAndView.addObject("usuarios", usuarios);
		return modelAndView;
	}
	

	@GetMapping("/login")
	public ModelAndView getTeste() {
		ModelAndView modelAndView = new ModelAndView("login.html");
		return modelAndView;
	}
	

}

