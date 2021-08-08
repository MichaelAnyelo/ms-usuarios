package com.clasejava.microservicios.app.usuarios.services;

import java.util.List;

import com.clasejava.microservicios.app.commons.alumnos.models.entity.Alumno;
import com.clasejava.microservicios.app.commons.service.CommonService;

public interface AlumnoService extends CommonService<Alumno> {
	
	public List<Alumno> findByNombreOrApellido(String term);

}
