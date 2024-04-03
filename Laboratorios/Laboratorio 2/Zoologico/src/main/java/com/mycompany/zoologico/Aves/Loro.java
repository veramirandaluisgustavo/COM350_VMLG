/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zoologico.Aves;

import Interfaces.IAve;
import com.mycompany.zoologico.Animal;

/**
 *
 * @author HP
 */
public class Loro extends Animal  implements IAve{
    String nombre;
    double peso;
    double tamanioAlas;

    @Override
    public void volar() {
        System.out.println("El loro esta volando");
    }

    public Loro(String nombre, double peso, double tamanioAlas) {
        this.nombre = nombre;
        this.peso = peso;
        this.tamanioAlas = tamanioAlas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getTamanioAlas() {
        return tamanioAlas;
    }

    public void setTamanioAlas(double tamanioAlas) {
        this.tamanioAlas = tamanioAlas;
    }

    @Override
    public String toString() {
        return "Loro{" + "nombre=" + nombre + ", peso=" + peso + ", tamanioAlas=" + tamanioAlas + '}';
    }
    @Override
    public void mostrar() {
        System.out.println(toString());
    }
    
}
