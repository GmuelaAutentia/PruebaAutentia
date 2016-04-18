package jsfspring.controller;

import jsfspring.dao.ProfesorMapper;
import jsfspring.model.Profesor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.List;

@ManagedBean(name = "listadoProfesoresController")
@SessionScoped
@Controller
public class ListadoProfesoresController implements Serializable {

    private static final long serialVersionUID = 1L;

    @Autowired
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

        this.profesores = profesorMapper.listarProfesores();

    }

}
