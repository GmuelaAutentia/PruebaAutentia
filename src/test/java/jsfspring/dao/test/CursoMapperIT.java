package jsfspring.dao.test;

import jsfspring.bean.Curso;
import jsfspring.bean.builder.CursoBuilder;
import jsfspring.dao.CursoMapper;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.core.Is.is;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/applicationContext-test.xml"})
@Transactional
public class CursoMapperIT {

    @Autowired
    private CursoMapper cursoMapper;

    private static CursoBuilder cursoBuilder;

    private static Curso curso;

    @BeforeClass
    public static void tearUp() {

        cursoBuilder = new CursoBuilder("CursoPrueba", "NivelPrueba", 30, 5L);

        curso = cursoBuilder.setActivo(true)
                            .build();
    }

    @Test
    public void shouldReturnAListOfCursosWhenCallingListarCursos() {

        List listaCursos = cursoMapper.getListaCursos();
        assertThat(listaCursos, is(notNullValue()));
        assertThat(listaCursos.size(), is(0));
    }

    @Test
    public void shouldInsertOneCursoIntoDBWhenCallingInsert() {

        cursoMapper.insert(curso);
        List listaCursos = cursoMapper.getListaCursos();
        assertThat(listaCursos, is(notNullValue()));
        assertThat(listaCursos.size(), is(1));


    }





}
