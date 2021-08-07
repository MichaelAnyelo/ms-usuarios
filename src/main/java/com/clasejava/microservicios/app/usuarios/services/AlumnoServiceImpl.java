package com.clasejava.microservicios.app.usuarios.services;


import org.springframework.stereotype.Service;

import com.clasejava.microservicios.app.commons.alumnos.models.entity.Alumno;
import com.clasejava.microservicios.app.commons.service.CommonServiceImpl;
import com.clasejava.microservicios.app.usuarios.models.repository.AlumnoRepository;

@Service
public class AlumnoServiceImpl extends CommonServiceImpl<Alumno, AlumnoRepository> implements AlumnoService {

	

}
