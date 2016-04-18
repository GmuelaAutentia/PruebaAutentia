package jsfspring.controller;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import jsfspring.dao.CursoMapper;
import jsfspring.model.Curso;



@ManagedBean(name = "altaCursosController")
@ViewScoped
public class AltaCursosController {

	@ManagedProperty(value="#{curso}")
	private Curso curso;

	@ManagedProperty(value="#{cursoMapper}")
	CursoMapper cursoMapper;
	
	
	public void darAltaCurso() throws IOException{
			
		cursoMapper.insert(this.curso);		
		FacesContext.getCurrentInstance().getExternalContext().redirect("listadoCursos.xhtml?i=1");
		
	}
	
	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public CursoMapper getCursoMapper() {
		return cursoMapper;
	}

	public void setCursoMapper(CursoMapper cursoMapper) {
		this.cursoMapper = cursoMapper;
	}
	
	
	
}
