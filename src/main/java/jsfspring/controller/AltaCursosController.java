package jsfspring.controller;

import jsfspring.bean.Curso;
import jsfspring.bean.builder.CursoBuilder;
import jsfspring.dao.CursoMapper;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import java.io.IOException;


@ManagedBean(name = "altaCursosController")
@ViewScoped
public class AltaCursosController {

    @ManagedProperty(value = "#{cursoMapper}")
    private CursoMapper cursoMapper;

    private CursoBuilder cursoBuilder;

    private boolean activo;
    private String titulo;
    private String nivel;
    private Integer horas;
    private Long idProfesor;


    public void darAltaCurso() throws IOException{

        cursoBuilder =   new CursoBuilder(this.titulo, this.nivel, this.horas, this.idProfesor);

        Curso curso = cursoBuilder.setActivo(this.activo)
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

    public Long getIdProfesor() {

        return idProfesor;
    }

    public void setIdProfesor(Long idProfesor) {

        this.idProfesor = idProfesor;
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
