
package com.mycompany.concesionarialogin.persistencia;

import com.mycompany.concesionarialogin.logica.Auto;
import com.mycompany.concesionarialogin.logica.Usuario;
import com.mycompany.concesionarialogin.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {
    AutoJpaController autoJpa = new AutoJpaController();
    UsuarioJpaController usuJpa = new UsuarioJpaController();
    
    public List<Auto> traerAutos() {
        return autoJpa.findAutoEntities();
    }

    public List<Usuario> traerUsuarios() {
        return usuJpa.findUsuarioEntities();
    }

    public void agregarAuto(Auto auto) {
        autoJpa.create(auto);
    }

    public void eliminarAuto(int id) {
        try {
            autoJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void agregarUsuario(Usuario user) {
        usuJpa.create(user);
    }

    public void eliminarUsuario(int id) {
        try {
            usuJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Auto traerAuto(int idAuto) {
        return autoJpa.findAuto(idAuto);
    }

    public void editarAuto(Auto auto) {
        try {
            autoJpa.edit(auto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
