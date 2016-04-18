package jsfspring.bean;

import java.io.Serializable;


public class Profesor implements Serializable {


    private Long id;
    private String nombre;
    private String apellido;

    public Profesor(Long id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombreCompleto() {

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
