/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.peluqueriacanina.Persistencia;

import com.mycompany.peluqueriacanina.Logica.Duenio;
import com.mycompany.peluqueriacanina.Logica.Mascota;
import com.mycompany.peluqueriacanina.Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    
    DuenioJpaController duenioJpa = new DuenioJpaController();
    MascotaJpaController mascotaJpa = new MascotaJpaController();

    public void guardar(Duenio duenio, Mascota mascota) {
       //Crear en la BD el dueño
       duenioJpa.create(duenio);
       
       //Crear en la BD la mascota  
       mascotaJpa.create(mascota);
       
    }

    public List<Mascota> traerMascotas() {
        return mascotaJpa.findMascotaEntities();
    }

    public void eliminarMascota(int id) {
        try {
            mascotaJpa.destroy(id);
            duenioJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Mascota TraerMascota(int num_cliente) {
        return mascotaJpa.findMascota(num_cliente);
    }

    public void modificarMascota(Mascota mascota) {
        try {
            mascotaJpa.edit(mascota);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Duenio traerDuenio(int id_duenio) {
        return duenioJpa.findDuenio(id_duenio); 
    }

    public void modificarDuenio(Duenio duenio) {
        try {
            duenioJpa.edit(duenio);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
