/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.builder;

/**
 *
 * @author HP
 */
public class HamburguesaCarnivoraBuilder extends HamburguesaBuilder {

    @Override
    public void buildCarne() {
        hamburguesa.setCarne("de res doble");
    }

    @Override
    public void buildPan() {
        hamburguesa.setPan("de centeno con mucho ajonjoli");
    }

    @Override
    public void buildAderezos() {
        hamburguesa.setAderezos(" lechuga,tomate y bacon");
    }
    
}
