package jsfspring.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import jsfspring.dao.CursoMapper;
import jsfspring.model.Curso;

@ManagedBean(name = "listadoCursosController")
@ViewScoped
public class ListadoCursosController implements Serializable {

	private static final long serialVersionUID = 1L;
	

	@ManagedProperty(value="#{cursoMapper}")
	CursoMapper cursoMapper;
	
	@ManagedProperty(value="#{cursos}")
	private List<Curso> cursos; 
	
	
	public CursoMapper getCursoMapper() {
		return cursoMapper;
	}

	public void setCursoMapper(CursoMapper cursoMapper) {
		this.cursoMapper = cursoMapper;
	}

	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {		
		this.cursos = cursoMapper.listarCursos();
	}
	
}
