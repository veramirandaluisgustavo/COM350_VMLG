/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.builder;

/**
 *
 * @author HP
 */
public class HamburguesaVegetarianaBuilder extends HamburguesaBuilder {
    
    @Override
    public void buildPan(){
        hamburguesa.setPan("de centeno");
    }

    @Override
    public void buildCarne() {
        hamburguesa.setCarne("de legumbres");
    }

    @Override
    public void buildAderezos() {
        hamburguesa.setAderezos("lechuga y tomate");
    }
    
}
