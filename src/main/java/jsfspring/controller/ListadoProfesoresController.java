package jsfspring.controller;

import jsfspring.dao.ProfesorMapper;
import jsfspring.bean.Profesor;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.List;

@ManagedBean(name = "listadoProfesoresController")
@ViewScoped
public class ListadoProfesoresController implements Serializable {

    private static final long serialVersionUID = 1L;

    @ManagedProperty(value = "#{profesorMapper}")
    ProfesorMapper profesorMapper;

    private List<Profesor> profesores;

    private String profesor;

    @PostConstruct
    public void init(){

        this.profesores = profesorMapper.getProfesores();

    }

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

}
