/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inversion_de_liskov;

/**
 *
 * @author HP
 */
public class Circulo extends FiguraGeometrica {
    
    double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }
    
    

    @Override
    public double calcularArea() {
        return 3.1415*this.radio*this.radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2*this.radio*3.1415;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
}
