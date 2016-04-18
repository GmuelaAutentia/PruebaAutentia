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
import jsfspring.dao.impl.CursoMapperImpl;
import jsfspring.model.Curso;

public class CursoMapperTest {

	@InjectMocks
	private CursoMapperImpl sut;

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
	public void testListarCursos() {

		ArrayList<Curso> lista = new ArrayList<Curso>();

		when(cursoMapper.listarCursos()).thenReturn(lista);

		sut.listarCursos();

		verify(cursoMapper).listarCursos();

	}

	@Test
	public void testInsertarCursos() {

	}

}
