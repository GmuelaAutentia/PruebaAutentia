package jsfspring.controller;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import jsfspring.dao.CursoMapper;
import jsfspring.dao.impl.CursoMapperImpl;
import jsfspring.model.Curso;
import jsfspring.model.builder.CursoBuilder;
import org.springframework.beans.factory.annotation.Autowired;


@ManagedBean(name = "altaCursosController")
@ViewScoped
public class AltaCursosController {

	@Autowired
	CursoMapper cursoMapper;

	CursoBuilder cursoBuilder;

	private boolean activo;
	private String titulo;
	private String nivel;
	private Integer horas;
	private String profesor;
	
	
	public void darAltaCurso() throws IOException{

        System.out.println(cursoMapper);

		cursoBuilder = new CursoBuilder(this.titulo,this.nivel,this.horas);

		Curso curso = cursoBuilder.setActivo(this.activo)
                                  .setProfesor(this.profesor)
				                  .build();
			
		cursoMapper.insert(curso);
		FacesContext.getCurrentInstance().getExternalContext().redirect("listadoCursos.xhtml?i=1");
		
	}

	public CursoMapper getCursoMapper() {

		return cursoMapper;
	}

	public void setCursoMapper(CursoMapper cursoMapper) {

		this.cursoMapper = cursoMapper;
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

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}
}
