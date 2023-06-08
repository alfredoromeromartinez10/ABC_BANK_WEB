package com.crud.h2.modeloDAO;

import java.util.List;

import com.crud.h2.modelo.Contacto;

public interface IContacto {
public List<Contacto>listar();
public Contacto listarPersonaId(int id);
public int agregar(Contacto p);
public int editar(Contacto p);
public void delete (int id);
}