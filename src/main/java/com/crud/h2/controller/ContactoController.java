package com.crud.h2.controller;

import org.springframework.web.bind.annotation.GetMapping;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.crud.h2.modelo.Contacto;
import com.crud.h2.service.IContactoService;

@Controller
public class ContactoController {

	@Autowired
	private IContactoService service;
	
	//@GetMapping ("/listar")
	 @RequestMapping(value="/listar", method = RequestMethod.GET)
	public String listar(Model model) {
		
	model.addAttribute("personas", service.listar());
	 return "index";
	}
	@GetMapping("/nuevo")
	public String nuevo() {
		return "agregar";
	}
		
	@PostMapping("/agregar")
	public String agregar(@Validated Contacto p) {
		service.agregar(p);
		return "redirect:/listar";
	}
	
	@GetMapping("editar/{id}")
	public String editar(@PathVariable int id, Model model) {
		Contacto persona=service.listarPersonaId(id);
		model.addAttribute("persona",persona);
		return "editar";
		
	}
	@PostMapping("/actualizar")
	public String actualizar(@Validated Contacto p) {
		service.editar(p);
		return "redirect:/listar";
	}
	
	@GetMapping("eliminar/{id}")
	public String delete(@PathVariable int id) {
		service.delete(id);
		return "redirect:/listar";
	}
}

