package jsfspring.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import jsfspring.dao.CursoMapper;
import jsfspring.model.Curso;

public class CursoMapperImpl implements CursoMapper, Serializable {

	private CursoMapper cursoMapper;

	@Autowired
	public CursoMapperImpl(CursoMapper cursoMapper) {

		this.cursoMapper = cursoMapper;

	}

	private static final long serialVersionUID = 1L;

	@Transactional
	public List<Curso> listarCursos() {

		return cursoMapper.listarCursos();
	}

	@Transactional
	public void insert(Curso curso) {
		cursoMapper.insert(curso);

	}

}
