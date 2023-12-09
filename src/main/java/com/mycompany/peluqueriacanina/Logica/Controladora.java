/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.peluqueriacanina.Logica;

import com.mycompany.peluqueriacanina.Persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia(); 

    public void guardar(String nombreMasco, String raza, String color, String observaciones, String alergico, String atencionEspecial, String nombreDuenio, String celDuenio) {
        Duenio duenio = new Duenio();
        duenio.setNombre(nombreDuenio);
        duenio.setCelDuenio(celDuenio);
        
        Mascota mascota = new Mascota();
        mascota.setNombre(nombreMasco);
        mascota.setRaza(raza);
        mascota.setColor(color);
        mascota.setAlergico(alergico);
        mascota.setAtencion_Especial(atencionEspecial);
        mascota.setObervaciones(observaciones);
        mascota.setDuenio(duenio);
        
        controlPersis.guardar(duenio, mascota);
        
    }

    public List<Mascota> traerMascotas() {
        return controlPersis.traerMascotas();
    }

    public void eliminarMascota(int id) {
        controlPersis.eliminarMascota(id);
    }

    public Mascota traerMascota(int num_cliente) {
        return controlPersis.TraerMascota(num_cliente);
    }

    public void modificarMascota(Mascota mascota, String nombreMasco, String raza, String color, String observaciones, 
        String alergico, String atencionEspecial, String nombreDuenio, String celDuenio) {
        mascota.setNombre(nombreMasco);
        mascota.setRaza(raza);
        mascota.setColor(color);
        mascota.setObervaciones(observaciones);
        mascota.setAtencion_Especial(atencionEspecial);
        mascota.setAlergico(alergico);
        
        //Modifico datos de la mascota
        controlPersis.modificarMascota(mascota);
        
        //seteo nuevos valores del dueño    
        Duenio duenio = this.buscarDuenio(mascota.getDuenio().getId_duenio());
        duenio.setCelDuenio(celDuenio);
        duenio.setNombre(nombreDuenio);
        
        //Llamar al modificar duenio
        this.modificarDuenio(duenio);
    }

    private Duenio buscarDuenio(int id_duenio) {
          return controlPersis.traerDuenio(id_duenio);  
    }

    private void modificarDuenio(Duenio duenio) {
        controlPersis.modificarDuenio(duenio);
    }
    
}