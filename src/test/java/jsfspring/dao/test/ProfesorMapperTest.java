package jsfspring.dao.test;

import jsfspring.dao.ProfesorMapper;
import jsfspring.dao.service.ProfesorService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.verify;

public class ProfesorMapperTest {

    @InjectMocks
    ProfesorService sut;

    @Mock
    ProfesorMapper profesorMapper;

    @Before
    public void setUp() throws Exception {

        MockitoAnnotations.initMocks(this);

    }

    @After
    public void tearDown() throws Exception {

        sut = null;

    }

    @Test
    public void shouldCallGetProfesoresCorrectly(){

        sut.getProfesores();

        verify(profesorMapper).getProfesores();

    }

}
