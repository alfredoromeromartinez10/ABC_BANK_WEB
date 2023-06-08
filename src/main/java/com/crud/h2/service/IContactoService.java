package com.crud.h2.service;

import java.util.List;

import com.crud.h2.modelo.Contacto;

public interface IContactoService {

	
	public List<Contacto>listar();
	public Contacto listarPersonaId(int id);
	public int agregar(Contacto p);
	public int editar(Contacto p);
	public void delete (int id);
	
}
