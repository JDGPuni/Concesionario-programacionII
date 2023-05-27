package com.tucarro.model;

public abstract class Vehiculo {
    // Declarar atributos
    private String marca;
    private String modelo;
    enum tipoEstado {NUEVO, USADO}
    private tipoEstado estadoVehiculo;
    private int cambios;
    private int velocidadMaxima;
    private int cilindraje;
    enum tipoCombustible {GASOLINA, DIESEL, ELECTRICO, HIBRIDO}
    private tipoCombustible combustible;
    enum tipoTransmision {AUTOMATICO, MANUAL}
    private tipoTransmision transmision;
    private String[] fotos;
    enum tipoAbs {SI, NO}
    private tipoAbs abs;

    //Constructor
    public Vehiculo(String marca, String modelo, tipoEstado estadoVehiculo, int cambios, int velocidadMaxima, int cilindraje,
                    tipoCombustible combustible, tipoTransmision transmision, String[] fotos, tipoAbs abs){
        this.marca = marca;
        this.modelo = modelo;
        this.estadoVehiculo = estadoVehiculo;
        this.cambios = cambios;
        this.velocidadMaxima = velocidadMaxima;
        this.cilindraje = cilindraje;
        this.combustible = combustible;
        this.transmision = transmision;
        this.fotos = fotos;
        this.abs = abs;
    }
    //Métodos Getters and Setters

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public tipoEstado getEstadoVehiculo() {
        return estadoVehiculo;
    }

    public void setEstadoVehiculo(tipoEstado estadoVehiculo) {
        this.estadoVehiculo = estadoVehiculo;
    }

    public int getCambios() {
        return cambios;
    }

    public void setCambios(int cambios) {
        this.cambios = cambios;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public tipoCombustible getCombustible() {
        return combustible;
    }

    public void setCombustible(tipoCombustible combustible) {
        this.combustible = combustible;
    }

    public tipoTransmision getTransmision() {
        return transmision;
    }

    public void setTransmision(tipoTransmision transmision) {
        this.transmision = transmision;
    }

    public String[] getFotos() {
        return fotos;
    }

    public void setFotos(String[] fotos) {
        this.fotos = fotos;
    }

    public tipoAbs getAbs() {
        return abs;
    }

    public void setAbs(tipoAbs abs) {
        this.abs = abs;
    }

    public abstract String toString();
}