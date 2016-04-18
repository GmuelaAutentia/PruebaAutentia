package jsfspring.model.builder;

import jsfspring.model.Curso;

public class CursoBuilder {

    private boolean activo;
    private String titulo;
    private String nivel;
    private Integer horas;
    private String profesor;

    public CursoBuilder(String titulo, String nivel, Integer horas) {
        this.titulo = titulo;
        this.nivel = nivel;
        this.horas = horas;
    }

    public Curso build(){

        return new Curso(this.activo,this.titulo,this.nivel,this.horas,this.profesor);

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

    public String getProfesor() {
        return profesor;
    }

    public CursoBuilder setProfesor(String profesor) {
        this.profesor = profesor;
        return this;
    }
}
