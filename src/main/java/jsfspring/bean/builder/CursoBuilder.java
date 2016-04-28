package jsfspring.bean.builder;

import jsfspring.bean.Curso;

public class CursoBuilder {

    private Long id;
    private boolean activo;
    private String titulo;
    private String nivel;
    private Integer horas;
    private Long idProfesor;

    public CursoBuilder(String titulo, String nivel, Integer horas, Long idProfesor) {
        this.titulo = titulo;
        this.nivel = nivel;
        this.horas = horas;
        this.idProfesor = idProfesor;
    }

    public Curso build(){

        return new Curso(this.id, this.activo,this.titulo,this.nivel,this.horas,this.idProfesor);

    }

    public boolean isActivo() {
        return activo;
    }

    public CursoBuilder setActivo(boolean activo) {
        this.activo = activo;
        return this;
    }

    public String getTitulo() {
        return titulo;
    }

    public CursoBuilder setTitulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    public String getNivel() {
        return nivel;
    }

    public CursoBuilder setNivel(String nivel) {
        this.nivel = nivel;
        return this;
    }

    public Integer getHoras() {
        return horas;
    }

    public CursoBuilder setHoras(Integer horas) {
        this.horas = horas;
        return this;
    }

    public Long getIdProfesor() {
        return idProfesor;
    }

    public CursoBuilder setIdProfesor(Long idProfesor) {
        this.idProfesor = idProfesor;
        return this;
    }
}
