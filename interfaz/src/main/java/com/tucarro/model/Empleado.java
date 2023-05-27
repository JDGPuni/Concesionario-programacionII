package com.tucarro.model;

import java.util.ArrayList;

public class Empleado extends Persona{

    //Atributos
    enum estadoEmpleado {ACTIVO, BLOQUEADO};
    public estadoEmpleado estado;
    ArrayList<Empleado> reportes = new ArrayList<Empleado>();

    //Constructores
    public Empleado(String email, String contraseña){
        super(email, contraseña);
    }
    public Empleado(String nombre, String apellido, String cedula, String email, String contraseña){
        super(nombre, apellido, cedula, email, contraseña);
    }
    public Empleado(String nombre, String apellido, String cedula, String email, String contraseña, estadoEmpleado estado, ArrayList<Empleado> reportes){
        super(nombre, apellido, cedula, email, contraseña);
        this.estado = estado;
        this.reportes = reportes;
    }

    //--------------------Métodos Getter and Setter---------------------------
    public estadoEmpleado getEstado(){
        return estado;
    }
    public void setEstado(estadoEmpleado estado){
        this.estado = estado;
    }

    public ArrayList<Empleado> getReportes() {
        return reportes;
    }

    public void setReportes(ArrayList<Empleado> reportes) {
        this.reportes = reportes;
    }


//----------------------------- Métodos --------------------------------------------

    public void registrarVehiculo(Vehiculo.tipoCombustible combustible, Vehiculo.tipoTransmision transmision, String placa, String marca, String uso, int modelo,
                                  String cambios, double velocidadMaxima, double cilindraje){


    }

    public void eliminarVehiculo(){

    }

    public void alquilarVehiculo(){

    }

    public void venderVehiculo(){

    }

    @Override
    public String toString() {
        return null;
    }
}
