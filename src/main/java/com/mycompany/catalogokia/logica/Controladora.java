package com.mycompany.catalogokia.logica;

import com.mycompany.catalogokia.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardarDatos(String modelo, String anio, String Motor, String color, String placa, String puerta) {
        Automovil auto = new Automovil();
        auto.setModelo(modelo);
        auto.setAnio(anio);
        auto.setMotor(Motor);
        auto.setColor(color);
        auto.setPlaca(placa);
        auto.setCantidadPuertas(puerta);
        
        controlPersis.crearAutomovil(auto);
    }

    public List<Automovil> traerVehiculos() {
       return controlPersis.traerVehiculos();
    }

    public void eliminarVehiculo(int id) {
        controlPersis.eliminarVehiculo(id);
    }

    public Automovil traerVehiculo(int id) {
        return controlPersis.traerVehiculo(id);
        
    }

    public void editarVehiculo(Automovil auto,String modelo, String anio, String Motor, String color, String placa, String puerta) {
        auto.setModelo(modelo);
        auto.setAnio(anio);
        auto.setMotor(Motor);
        auto.setColor(color);
        auto.setPlaca(placa);
        auto.setCantidadPuertas(puerta);
        controlPersis.editarAutomovil(auto);
    }

}
