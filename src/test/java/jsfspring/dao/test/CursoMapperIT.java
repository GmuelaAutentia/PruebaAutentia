package jsfspring.dao.test;

import jsfspring.dao.CursoMapper;

import static junit.framework.TestCase.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.core.Is.is;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/applicationContext-test.xml"})
@Transactional
public class CursoMapperIT {

    @Autowired
    private CursoMapper cursoMapper;

    @Test
    public void shouldReturnAListOfCursosWhenCallingListarCursos(){

        List listaCursos = cursoMapper.getListaCursos();
        assertNotNull(listaCursos);
        assertThat(listaCursos.size(), is(greaterThan(1)));
    }

    @Test
    public void shouldInsertOneCursoIntoDBWhenCallingInsert(){



    }

}
