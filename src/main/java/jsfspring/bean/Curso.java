package jsfspring.bean;

import java.io.Serializable;


public class Curso implements Serializable {

    private Long id;
    private Boolean activo;
    private String titulo;
    private String nivel;
    private Integer horas;
    private Long idProfesor;

    public Curso(Long id, Boolean activo, String titulo, String nivel, Integer horas, Long idProfesor) {
        this.id = id;
        this.activo = activo;
        this.titulo = titulo;
        this.nivel = nivel;
        this.horas = horas;
        this.idProfesor = idProfesor;
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

}
