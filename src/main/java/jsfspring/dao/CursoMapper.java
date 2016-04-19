package jsfspring.dao;

import java.util.List;

import jsfspring.bean.Curso;

public interface CursoMapper {

    List<Curso> getListaCursos();

    void insert(Curso curso);
}