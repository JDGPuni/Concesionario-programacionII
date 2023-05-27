package com.tucarro.model;

import java.util.ArrayList;

public class Login {
    Persona admin = new Administrador("admin", "admin");
    Persona empleado1 = new Empleado("user1", "123");

    // ArrayList de usuarios con acceso.
    ArrayList<Persona> usuarios = new ArrayList<Persona>();

    // Constructores
    public Login(){}
    public Login(ArrayList<Persona> usuarios){
        this.usuarios = usuarios;
    }

    //Métodos Getters and Setters
    public ArrayList<Persona> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Persona> usuarios) {
        this.usuarios = usuarios;
    }

    //---------------------------Métodos-----------------------------------------
    /**
     * Método que permite iniciar sesión, validando los datos de acceso.
     * @param usuario
     * @param contraseña
     * @return acceso
     */
    public boolean iniciarSesion(String usuario, String contraseña){

        boolean acceso = false;

        usuarios.add(admin);
        usuarios.add(empleado1);

        for(int i = 0; i < usuarios.size(); i++){
            if(usuarios.get(i).getEmail().equals(usuario) && usuarios.get(i).getContraseña().equals(contraseña)){
                acceso = true;
            }
        }
        return acceso;
    }

    /**
     * Método que permite validar la palabra secreta para dar acceso en caso de olvido de contraseña.
     */
    public boolean restaurarContraseña(String palabra){
        String respuesta = "tu carro";
        boolean acceso = false;

        if (palabra.equals(respuesta)){
            acceso = true;
        }
        return acceso;
    }
}
