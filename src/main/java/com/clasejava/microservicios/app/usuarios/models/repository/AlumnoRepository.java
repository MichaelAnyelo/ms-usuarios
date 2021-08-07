package com.clasejava.microservicios.app.usuarios.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.clasejava.microservicios.app.commons.alumnos.models.entity.Alumno;

public interface AlumnoRepository extends CrudRepository<Alumno, Long> {
	
	

}
