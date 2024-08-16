
package com.mycompany.concesionarialogin.logica;

import com.mycompany.concesionarialogin.persistencia.ControladoraPersistencia;
import java.util.List;


public class Controladora {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public List<Auto> traerAutos() {
        return controlPersis.traerAutos();
    }

    public boolean validarUsuario(String usuario, String contra) {
        
        List <Usuario> listaUsuarios = controlPersis.traerUsuarios();
        
        for(Usuario user : listaUsuarios){
            if(user.getNombreUsuario().equals(usuario) && user.getContrasenia().equals(contra)){
                return true;
            }
        }
        return false;
    }

    public List<Usuario> traerUsuarios() {
        return controlPersis.traerUsuarios();
    }

    public void agregarAuto(String marca, String modelo, String anio, String patente) {
        
        Auto auto = new Auto(marca,modelo,anio,patente);
        
        controlPersis.agregarAuto(auto);
    }

    public void eliminarAuto(int id) {
        controlPersis.eliminarAuto(id);
    }

    public void agregarUsuario(String nombre, String contra) {
        Usuario user = new Usuario (nombre,contra);
        controlPersis.agregarUsuario(user);
    }

    public void eliminarUsuario(int id) {
         controlPersis.eliminarUsuario(id);
    }

    public Auto traerAuto(int idAuto) {
        return controlPersis.traerAuto(idAuto);
    }

    public void editarAuto(Auto auto, String marca, String modelo, String patente, String anio) {
        auto.setMarca(marca);
        auto.setModelo(modelo);
        auto.setPatente(patente);
        auto.setAnio(anio);
        controlPersis.editarAuto(auto);
    }

    
}
