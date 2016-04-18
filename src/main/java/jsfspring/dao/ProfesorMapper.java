package jsfspring.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import jsfspring.model.Profesor;

public interface ProfesorMapper {

	List<Profesor> getProfesores();
}
