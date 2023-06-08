package com.crud.h2.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.modelo.Contacto;
import com.crud.h2.modeloDAO.IContacto;


@Service
public class ContactoService implements IContactoService{

	@Autowired
	private  IContacto dao;
	@Override
	public List<Contacto> listar() {
	
		return dao.listar();
	}

	@Override
	public Contacto listarPersonaId(int id) {
		
		
		
		return dao.listarPersonaId(id);
	}

	@Override
	public int agregar(Contacto p) {
		dao.agregar(p);
		
		
		return 0;
	}

	@Override
	public int editar(Contacto p) {
		
		dao.editar(p);
		
		
		return 0;
	}

	@Override
	public void delete(int id) {
		
		dao.delete(id);
	}

}
