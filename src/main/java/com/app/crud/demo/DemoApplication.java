package com.app.crud.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.crud.demo.entidad.Estudiante;
import com.app.crud.demo.repositorio.EstudianteRepositorio;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Autowired
	private EstudianteRepositorio estudianteRepositorio;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*
		 * Estudiante estudiante1 = new Estudiante("Juan Sebastian", "Montoya Vasquez",
		 * "Juan@gmail.com");
		 * estudianteRepositorio.save(estudiante1);
		 * 
		 * Estudiante estudiante2 = new Estudiante("Cristhiam", "Ramirez",
		 * "Cris@gmail.com");
		 * estudianteRepositorio.save(estudiante2);
		 * Estudiante estudiante3 = new Estudiante("Kevin", "Valencia",
		 * "Kevin@gmail.com");
		 * estudianteRepositorio.save(estudiante3);
		 */

	}

}
