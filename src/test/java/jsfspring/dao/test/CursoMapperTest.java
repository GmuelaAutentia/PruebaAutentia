package jsfspring.dao.test;

import jsfspring.bean.Curso;
import jsfspring.dao.CursoMapper;
import jsfspring.dao.service.CursoService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class CursoMapperTest {

	@InjectMocks
	private CursoService sut;

	@Mock
	private CursoMapper cursoMapper;

	@Before
	public void setUp() throws Exception {

		MockitoAnnotations.initMocks(this);

	}

	@After
	public void tearDown() throws Exception {

		sut = null;

	}

	@Test
	public void shouldCallGetListaCursosCorrectly() {

		sut.getListaCursos();
		verify(cursoMapper).getListaCursos();

	}

	@Test
	public void shouldCallInsertCorrectly() {

		Curso curso = mock(Curso.class);
		sut.insert(curso);
		verify(cursoMapper).insert(curso);

	}

}
