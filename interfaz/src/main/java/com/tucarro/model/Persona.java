package com.tucarro.model;

public abstract class Persona {
    private String nombre;
    private String apellido;
    private String cedula;
    private String email;
    private String contraseña;

    public Persona() {
    }
    public Persona(String email, String contraseña){
        this.email = email;
        this.contraseña = contraseña;
    }
    public Persona(String nombre, String apellido, String cedula, String email, String contraseña){
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.email = email;
        this.contraseña = contraseña;
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

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public abstract String toString();
}
