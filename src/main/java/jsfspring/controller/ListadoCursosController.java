package jsfspring.controller;

import jsfspring.dao.CursoMapper;
import jsfspring.bean.Curso;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.List;

@ManagedBean(name = "listadoCursosController")
@ViewScoped
public class ListadoCursosController implements Serializable {

    private static final long serialVersionUID = 1L;

    @ManagedProperty(value = "#{cursoMapper}")
    CursoMapper cursoMapper;

    private List<Curso> cursos;

    @PostConstruct
    public void init(){

        this.cursos = cursoMapper.getListaCursos();

    }

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

        this.cursos = cursoMapper.getListaCursos();
    }

}
