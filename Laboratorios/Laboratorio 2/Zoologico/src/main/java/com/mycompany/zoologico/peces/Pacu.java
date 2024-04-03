/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zoologico.peces;

import Interfaces.IPez;
import com.mycompany.zoologico.Animal;

/**
 *
 * @author HP
 */
public class Pacu extends Animal  implements IPez {
    String nombre;
    double longitud;
    @Override
    public void nadar() {
        System.out.println("El Pacu Esta Nadando");
    }

    public Pacu(String nombre, double longitud) {
        this.nombre = nombre;
        this.longitud = longitud;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "Pacu{" + "nombre=" + nombre + ", longitud=" + longitud + '}';
    }
    @Override
    public void mostrar() {
        System.out.println(toString());
    }
    
    
}
