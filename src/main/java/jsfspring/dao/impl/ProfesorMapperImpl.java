package jsfspring.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import jsfspring.dao.ProfesorMapper;
import jsfspring.model.Profesor;

public class ProfesorMapperImpl implements ProfesorMapper, Serializable {

	private static final long serialVersionUID = 1L;
	
	ProfesorMapper profesorMapper;	
	
	@Autowired
	public ProfesorMapperImpl(ProfesorMapper profesorMapper) {

		this.profesorMapper = profesorMapper;
	}

	@Transactional
	public List<Profesor> listarProfesores() {
		
		return profesorMapper.listarProfesores();
	}

}
