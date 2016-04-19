package jsfspring.dao.service;

import jsfspring.bean.Curso;
import jsfspring.dao.CursoMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

@Repository
public class CursoService implements CursoMapper, Serializable {

    private transient CursoMapper cursoMapper;

    private CursoService() {

        //Default constructor

    }


    public CursoService(CursoMapper cursoMapper) {

        this.cursoMapper = cursoMapper;

    }


    @Override
    @Transactional
    public List<Curso> getListaCursos() {

        return cursoMapper.getListaCursos();
    }

    @Override
    @Transactional
    public void insert(Curso curso) {
        cursoMapper.insert(curso);

    }

}
