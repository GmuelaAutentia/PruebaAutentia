package jsfspring.model;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;


public class Curso implements Serializable {

	private Long id;
	private Boolean activo;
	private String titulo;
	private String nivel;
	private Integer horas;
	private String profesor;

	public Curso(Long id, Boolean activo, String titulo, String nivel, Integer horas, String profesor) {
		this.id = id;
		this.activo = activo;
		this.titulo = titulo;
		this.nivel = nivel;
		this.horas = horas;
		this.profesor = profesor;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public boolean isActivo() {

		return activo;
	}

	public void setActivo(boolean activo) {

		this.activo = activo;
	}

	public String getProfesor() {

		return profesor;
	}

	public void setProfesor(String profesor) {

		this.profesor = profesor;
	}

	public String getTitulo() {

		return titulo;
	}

	public void setTitulo(String titulo) {

		this.titulo = titulo;
	}

	public String getNivel() {

		return nivel;
	}

	public void setNivel(String nivel) {

		this.nivel = nivel;
	}

	public Integer getHoras() {

		return horas;
	}

	public void setHoras(Integer horas) {

		this.horas = horas;
	}

}
