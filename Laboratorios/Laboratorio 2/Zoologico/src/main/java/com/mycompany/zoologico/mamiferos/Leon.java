/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zoologico.mamiferos;

import Interfaces.IMamifero;
import com.mycompany.zoologico.Animal;

/**
 *
 * @author HP
 */
public class Leon extends Animal  implements IMamifero {
    String nombre;
    double temperatura;
    int numeroPatas;
    String color;

    @Override
    public double getTemperatura() {
        return this.temperatura;
    }

    public Leon(String nombre, double temperatura, int numeroPatas, String color) {
        this.nombre = nombre;
        this.temperatura = temperatura;
        this.numeroPatas = numeroPatas;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Leon{" + "nombre=" + nombre + ", temperatura=" + temperatura + ", numeroPatas=" + numeroPatas + ", color=" + color + '}';
    }
    @Override
    public void mostrar() {
        System.out.println(toString());
    }

    

    
    

  
    
}
