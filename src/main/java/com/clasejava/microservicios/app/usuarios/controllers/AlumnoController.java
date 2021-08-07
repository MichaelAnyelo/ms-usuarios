package com.clasejava.microservicios.app.usuarios.controllers;

import java.util.Optional;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.clasejava.microservicios.app.commons.alumnos.models.entity.Alumno;
import com.clasejava.microservicios.app.commons.controller.CommonController;
import com.clasejava.microservicios.app.usuarios.services.AlumnoService;


@RestController
public class AlumnoController extends CommonController<Alumno, AlumnoService> {


	@PutMapping("/{id}")
	public ResponseEntity<?> editar(@RequestBody Alumno alumno, @PathVariable(name = "id") Long id) {

		Optional<Alumno> o = service.findById(id);

		if (o.isEmpty()) {
			return ResponseEntity.notFound().build();
		}

		Alumno alumnoDb = o.get();

		alumnoDb.setNombre(alumno.getNombre());
		alumnoDb.setApellido(alumno.getApellido());
		alumnoDb.setEmail(alumno.getEmail());

		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(alumnoDb));
	}

}
