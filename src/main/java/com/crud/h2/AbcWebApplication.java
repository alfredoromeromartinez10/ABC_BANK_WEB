package com.crud.h2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class AbcWebApplication  implements CommandLineRunner{

	@Autowired
	private JdbcTemplate template;
	
	public static void main(String[] args) {
		SpringApplication.run(AbcWebApplication.class, args);
	}

	public void run(String... args) throws Exception {
	template.execute("DROP TABLE contacto IF EXISTS");
		template.execute("CREATE TABLE contacto(id INTEGER PRIMARY KEY auto_increment,first_name VARCHAR(255),second_name VARCHAR(255),addresses nvarchar(MAX),date_birth datetime, phone nvarchar(10),photo image)");
		
for (int i = 0; i < 3; i++) {
		template.update("insert into contacto (first_name) values ('Persona 0005')");
}
	}

}
