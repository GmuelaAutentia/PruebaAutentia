package jsfspring.controller;

import jsfspring.dao.CursoMapper;
import jsfspring.model.Curso;
import org.springframework.beans.factory.annotation.Autowired;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.List;

@ManagedBean(name = "listadoCursosController")
@ViewScoped
public class ListadoCursosController implements Serializable {

    private static final long serialVersionUID = 1L;

    @Autowired
    CursoMapper cursoMapper;

    @Autowired
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
