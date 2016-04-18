package jsfspring.model;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "profesor")
@ViewScoped
public class Profesor implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nombre;
	private String apellido;
	
	public String getNombreCompleto(){
		
		return nombre + " " + apellido;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

}
