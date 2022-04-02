package com.example.formularios.models;

import com.example.formularios.utils.Utilidades;

public class PersonasModel {
    private String nombre;
    private String apellido;
    private int edad;
    private String telefono;


    public PersonasModel(){
        this.nombre = "";
        this.apellido = "";
        this.edad = 0;
        this.telefono = "";
    }

    public PersonasModel(String nombre, String apellido, int edad, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.telefono = telefono;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        if (Utilidades.isNumber(edad)){
            this.edad = Integer.parseInt(edad);
        }
        else{
            this.edad = -1;
        }

    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
