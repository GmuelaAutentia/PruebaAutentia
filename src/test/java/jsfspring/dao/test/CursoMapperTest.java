package jsfspring.dao.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

import java.util.ArrayList;
import jsfspring.dao.CursoMapper;
import jsfspring.dao.impl.CursoService;
import jsfspring.bean.Curso;

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
	public void testGetListaCursos() {

		ArrayList<Curso> lista = new ArrayList<Curso>();

		when(cursoMapper.getListaCursos()).thenReturn(lista);

		sut.getListaCursos();

		verify(cursoMapper).getListaCursos();

	}

	@Test
	public void testInsertarCursos() {

	}

}
