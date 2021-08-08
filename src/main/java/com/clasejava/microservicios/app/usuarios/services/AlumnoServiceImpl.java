package com.clasejava.microservicios.app.usuarios.services;


import java.util.List;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.clasejava.microservicios.app.commons.alumnos.models.entity.Alumno;
import com.clasejava.microservicios.app.commons.service.CommonServiceImpl;
import com.clasejava.microservicios.app.usuarios.models.repository.AlumnoRepository;

@Service
public class AlumnoServiceImpl extends CommonServiceImpl<Alumno, AlumnoRepository> implements AlumnoService {

	@Override
	@Transactional(readOnly = true)
	public List<Alumno> findByNombreOrApellido(String term) {
		// TODO Auto-generated method stub
		return repository.findByNombreOrApellido(term);
	}

	

}
