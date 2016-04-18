package jsfspring.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import jsfspring.model.Curso;

public interface CursoMapper {

	List<Curso> listarCursos();
	
	void insert(Curso curso);
}
