package jsfspring.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

import jsfspring.dao.ProfesorMapper;
import jsfspring.model.Profesor;

@ManagedBean(name = "listadoProfesoresController")
@SessionScoped
public class ListadoProfesoresController implements Serializable {

	private static final long serialVersionUID = 1L;

	@ManagedProperty(value = "#{profesorMapper}")
	ProfesorMapper profesorMapper;

	private List<Profesor> profesores;
	
	private String profesor;

	public String getProfesor() {
		return profesor;
	}

	public void setProfesor(String selectedProfesor) {
		this.profesor = selectedProfesor;
	}

	public ProfesorMapper getProfesorMapper() {
		return profesorMapper;
	}

	public void setProfesorMapper(ProfesorMapper profesorMapper) {
		this.profesorMapper = profesorMapper;
	}

	public List<Profesor> getProfesores() {
		return profesores;
	}

	public void setProfesores(List<Profesor> profesores) {
		
		System.out.println(profesorMapper);
		
		System.out.println(profesorMapper.listarProfesores());
		
		this.profesores = profesorMapper.listarProfesores();

	}

}
