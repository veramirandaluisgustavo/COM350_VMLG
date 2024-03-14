/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inversion_de_liskov;

/**
 *
 * @author HP
 */
public class Rectangulo extends FiguraGeometrica {
    double ladoA,ladoB;

    public Rectangulo(double ladoA, double ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    @Override
    public double calcularArea() {
        return this.ladoA*this.ladoB;
    }

    @Override
    public double calcularPerimetro() {
       return  2*this.ladoA+2*this.ladoB;
    }
    
    
}
