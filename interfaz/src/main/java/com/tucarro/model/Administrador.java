package com.tucarro.model;

import javax.swing.*;
import java.util.ArrayList;
public class Administrador extends Persona{
    Empleado empleado = new Empleado("yuri","reyes","123","yuri123","1234");
    ArrayList<Empleado> empleados = new ArrayList<Empleado>();          // ArrayList que almacena los objetos empleados

    //Constructores
    public Administrador(){
        super();
    }
    public Administrador(String email, String contraseña){
        super(email, contraseña);
    }
    public Administrador(String nombre, String apellido, String cedula, String email, String contraseña, ArrayList<Empleado> empleados){
        super(nombre, apellido, cedula, email, contraseña);
        this.empleados = empleados;
    }

    //----------------------- Método Getter and Setter -----------------------------------------------
    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }
    //----------------------- Métodos -----------------------------------------------

    /**
     * Método que permite visualizar el reporte de un determinado empleado.
     * @param cedula
     * @param reportes
     */
    public void verReporte(String cedula, ArrayList<Empleado>reportes){
        for(int i = 0; i < empleados.size(); i++){                  //bucle que recorre el arraylist de empleado.
            if(empleados.get(i).getCedula().equals(cedula)){        //Condición encargada de buscar a él empleado que se desea ver el reporte.
                for(Empleado empleado: reportes){                   //Bucle que recorre el arraylist de reportes.
                }
            }
        }
    }

    /**
     * Método encargado de registrar un nuevo empleado.
     * @param nombre
     * @param apellido
     * @param cedula
     * @param email
     * @param contraseña
     */
    public boolean registrarEmpleado(String nombre, String apellido, String cedula, String email, String contraseña) {
        empleados.add(empleado);
        Empleado empleado = new Empleado(nombre, apellido, cedula, email, contraseña);
        empleado.setNombre(nombre);
        empleado.setApellido(apellido);
        empleado.setCedula(cedula);
        empleado.setEmail(email);
        empleado.setContraseña(contraseña);

        boolean registro = false;

        for(int i = 0; i < empleados.size(); i++){
            if(!empleados.get(i).getCedula().equals(cedula) && !empleados.get(i).getEmail().equals(email)){
                empleados.add(empleado);
                JOptionPane.showMessageDialog(null, empleados);
                registro = true;
            }
        }
        return registro;
    }

    /**
     * Método encargado de eliminar un determinado empleado.
     * @param cedula
     */
    public boolean eliminarEmpleado(String cedula){
        empleados.add(empleado);
        boolean eliminado = false;
        for(int i = 0; i < empleados.size(); i++){
            if(empleados.get(i).getCedula().equals(cedula)){
                empleados.remove(i);
                eliminado = true;
            }
        }
        return eliminado;
    }

    /**
     * Método encargado de actualizar los datos de un determinado empleado.
     * @param nombre
     * @param apellido
     * @param cedula
     * @param email
     * @param contraseña
     */
    public boolean actualizarDatosEmpleado(String nombre, String apellido, String cedula, String email, String contraseña){
        empleados.add(empleado);
        boolean actualizado = false;
            for(int i = 0; i < empleados.size(); i++){

                if(empleados.get(i).getCedula().equals(cedula)){
                    empleados.get(i).setNombre(nombre);
                    empleados.get(i).setApellido(apellido);
                    empleados.get(i).setEmail(email);
                    empleados.get(i).setContraseña(contraseña);

                    actualizado = true;
                }
            }
        return actualizado;
    }

    /**
     * métoto encargado de bloquear cuenta de un determinado empleado.
     * @param cedula
     */
    public void bloquearCuenta(String cedula){

        for(int i = 0; i < empleados.size(); i++){
            if(empleados.get(i).getCedula().equals(cedula)){
            }
        }
    }

    /**
     * Método que permite visualizar los datos del administrador
     * @return
     */
    @Override
    public String toString() {
        String mensaje = "*** TU PERFIL ***\n\n" +
                "Nombre: "+getNombre()+".\n" +
                "Apellido: "+getApellido()+".\n" +
                "Cédula: "+getCedula()+".\n" +
                "Correo: "+getEmail()+".";
        return mensaje;
    }
}
