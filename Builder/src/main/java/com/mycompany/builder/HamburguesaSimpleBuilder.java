/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.builder;

/**
 *
 * @author HP
 */
public class HamburguesaSimpleBuilder extends HamburguesaBuilder {

    @Override
    public void buildCarne() {
        hamburguesa.setCarne("de res");
    }

    @Override
    public void buildPan() {
        hamburguesa.setPan("de mesa");
    }

    @Override
    public void buildAderezos() {
        hamburguesa.setAderezos(" ketchup");
    }
    
    
}
