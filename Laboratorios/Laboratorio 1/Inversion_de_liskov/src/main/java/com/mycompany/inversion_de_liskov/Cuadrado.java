/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inversion_de_liskov;

/**
 *
 * @author HP
 */
public class Cuadrado extends FiguraGeometrica {
    double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return Math.pow(lado, 2);
        
    }

    @Override
    public double calcularPerimetro() {
        return this.lado*4;
        
    }
    
    
}
