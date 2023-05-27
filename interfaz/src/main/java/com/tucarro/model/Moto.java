package com.tucarro.model;

public class Moto extends Vehiculo{

    public Moto(String marca, String modelo, tipoEstado estadoVehiculo, int cambios, int velocidadMaxima, int cilindraje,
                tipoCombustible combustible, tipoTransmision transmision, String[] fotos, tipoAbs abs){
        super(marca, modelo, estadoVehiculo, cambios, velocidadMaxima, cilindraje, combustible, transmision, fotos, abs);
    }

    @Override
    public String toString() {
        String mensaje = "*** CARACTERISTICAS DE LA MOTO ***\n\n" +
                "Marca: "+getMarca()+".\n" +
                "Modelo: "+getModelo()+".\n" +
                "Estado: "+getEstadoVehiculo()+".\n" +
                "Cambios: "+getCambios()+".\n" +
                "Velocidad máxima: "+getVelocidadMaxima()+".\n" +
                "Cilindraje: "+getCilindraje()+".\n" +
                "Combustible: "+getCombustible()+".\n" +
                "Transmisión: "+getTransmision()+".\n" +
                "Abs: "+getAbs()+".\n" +
                "Fotos: "+getFotos()+".";
        return mensaje;
    }
}
