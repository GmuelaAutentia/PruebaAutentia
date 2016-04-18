package jsfspring.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import jsfspring.dao.ProfesorMapper;
import jsfspring.model.Profesor;

import javax.faces.bean.ApplicationScoped;

@ApplicationScoped
@Repository
public class ProfesorMapperImpl implements ProfesorMapper, Serializable {

	private static final long serialVersionUID = 1L;

	@Autowired
	ProfesorMapper profesorMapper;

	@Transactional
	public List<Profesor> listarProfesores() {
		
		return profesorMapper.listarProfesores();
	}

}
