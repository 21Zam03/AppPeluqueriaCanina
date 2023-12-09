/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.peluqueriacanina.Logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Mascota implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int num_Cliente;
    
    @Basic
    private String nombre;
    private String raza;
    private String color;
    private String alergico;
    private String atencion_Especial;
    private String obervaciones;
    
    @OneToOne
    private Duenio duenio;

    public Mascota() {
    }

    public Mascota(int num_Cliente, String nombre, String raza, String color, String alergico, String atencion_Especial, String obervaciones, Duenio duenio) {
        this.num_Cliente = num_Cliente;
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.alergico = alergico;
        this.atencion_Especial = atencion_Especial;
        this.obervaciones = obervaciones;
        this.duenio = duenio;
    }

    public int getNum_Cliente() {
        return num_Cliente;
    }

    public void setNum_Cliente(int num_Cliente) {
        this.num_Cliente = num_Cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAlergico() {
        return alergico;
    }

    public void setAlergico(String alergico) {
        this.alergico = alergico;
    }

    public String getAtencion_Especial() {
        return atencion_Especial;
    }

    public void setAtencion_Especial(String atencion_Especial) {
        this.atencion_Especial = atencion_Especial;
    }

    public String getObervaciones() {
        return obervaciones;
    }

    public void setObervaciones(String obervaciones) {
        this.obervaciones = obervaciones;
    }

    public Duenio getDuenio() {
        return duenio;
    }

    public void setDuenio(Duenio duenio) {
        this.duenio = duenio;
    }
    
    
}
