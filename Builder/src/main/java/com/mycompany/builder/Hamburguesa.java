/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.builder;

/**
 *
 * @author HP
 */
public class Hamburguesa {
    private String carne,pan,aderezos;

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public void setAderezos(String aderezos) {
        this.aderezos = aderezos;
    }

    @Override
    public String toString() {
        return "Hamburguesa{" + "carne=" + carne + ", pan=" + pan + ", aderezos=" + aderezos + '}';
    }
    
    
    
}
