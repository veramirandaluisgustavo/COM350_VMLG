/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.builder;

/**
 *
 * @author HP
 */
public class Cocina {
    private HamburguesaBuilder hamburguesaBuilder;

    public void setHamburguesaBuilder(HamburguesaBuilder hamburguesaBuilder) {
        this.hamburguesaBuilder = hamburguesaBuilder;
    }
    public Hamburguesa getHamburguesa(){
        return hamburguesaBuilder.getHamburguesa();
    }
    public void hacerHamburguesa(){
        hamburguesaBuilder.crearNuevaHamburguesa();
        hamburguesaBuilder.buildPan();
        hamburguesaBuilder.buildCarne();
        hamburguesaBuilder.buildAderezos();
    }
}
