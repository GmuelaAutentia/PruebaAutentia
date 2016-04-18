package jsfspring.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import jsfspring.dao.ProfesorMapper;
import jsfspring.bean.Profesor;

@Repository
public class ProfesorService implements ProfesorMapper, Serializable {

	private static final long serialVersionUID = 1L;

	@Autowired
	ProfesorMapper profesorMapper;

	@Transactional
	public List<Profesor> getProfesores() {
		
		return profesorMapper.getProfesores();
	}

}
