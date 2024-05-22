package com.mycompany.catalogokia.logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Automovil implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id;
    
    @Basic
    private String modelo;
    private String anio;
    private String motor;
    private String color;
    private String placa;
    private String cantidadPuertas;

    public Automovil() {
    }

    public Automovil(int id, String modelo, String anio, String motor, String color, String placa, String cantidadPuertas) {
        this.id = id;
        this.modelo = modelo;
        this.anio = anio;
        this.motor = motor;
        this.color = color;
        this.placa = placa;
        this.cantidadPuertas = cantidadPuertas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String año) {
        this.anio = año;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(String cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    
    
}
