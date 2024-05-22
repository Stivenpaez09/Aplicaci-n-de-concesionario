package com.mycompany.catalogokia.persistencia;

import com.mycompany.catalogokia.logica.Automovil;
import com.mycompany.catalogokia.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    AutomovilJpaController autoJpa = new AutomovilJpaController();

    public void crearAutomovil(Automovil auto) {
        autoJpa.create(auto);
    }

    public List<Automovil> traerVehiculos() {
        return autoJpa.findAutomovilEntities();
    }

    public void eliminarVehiculo(int id) {
        try {
            autoJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Automovil traerVehiculo(int id) {
        return autoJpa.findAutomovil(id);
    }

    public void editarAutomovil(Automovil auto){
        try {
            autoJpa.edit(auto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
