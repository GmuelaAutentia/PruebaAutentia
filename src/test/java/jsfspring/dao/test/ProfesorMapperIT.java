package jsfspring.dao.test;

import jsfspring.bean.Profesor;
import jsfspring.dao.ProfesorMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/applicationContext-test.xml"})
@Transactional
public class ProfesorMapperIT {

    @Autowired
    ProfesorMapper profesorMapper;

    @Test
    public void shouldReturnListProfesoresWhenCallingGetProfesorList(){

        List<Profesor> listaProfesores = profesorMapper.getProfesores();
        assertThat(listaProfesores,is(not(nullValue())));
        assertThat(listaProfesores.size(),is(1));
    }

}
