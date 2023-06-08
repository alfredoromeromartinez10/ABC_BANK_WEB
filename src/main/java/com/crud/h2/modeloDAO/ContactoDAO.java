package com.crud.h2.modeloDAO;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.crud.h2.modelo.Contacto;

@Repository
public class ContactoDAO implements IContacto{

	@Autowired
	private JdbcTemplate template;
	@Override
	public List<Contacto> listar() {
		String sql="select * from contacto";
		List<Contacto> personas=template.query(sql, new BeanPropertyRowMapper<Contacto>(Contacto.class));
		
		return personas;
	}

	@Override
	public Contacto listarPersonaId(int id) {
		
		String sql="select * from contacto where id=?";
		Contacto persona=template.queryForObject(sql,new Object[] {id}, new BeanPropertyRowMapper<Contacto>(Contacto.class));
		return persona;
	}

	@Override
	public int agregar(Contacto p) {
	
		String sql="insert into contacto(first_name) values(?)";
		int res=template.update(sql, p.getFirst_name());
		
		
		return res;
	}

	@Override
	public int editar(Contacto p) {
		
		String sql="update contacto set first_name=? where id?";
		int res=template.update(sql,p.getFirst_name(),p.getId());
		
		return res;
	}

	@Override
	public void delete(int id) {
		
		String sql="delete from contacto where id=?";
		template.update(sql,id);
	}

}
