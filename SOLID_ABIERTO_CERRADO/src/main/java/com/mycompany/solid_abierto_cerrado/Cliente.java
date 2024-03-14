/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.solid_abierto_cerrado;

/**
 *
 * @author HP
 */
public class Cliente extends Usuario{
    
    String puntos,codigo;

    public Cliente(String puntos, String codigo, String nombres, String apellidos, String sexo, String direccion, String correo, String celular) {
        super(nombres, apellidos, sexo, direccion, correo, celular);
        this.puntos = puntos;
        this.codigo = codigo;
    }

    

   

    @Override
    public String crear() {
        return "INSERT INTO clientes (puntos,codigo) VALUES('"+this.puntos+"','"+this.codigo+"')";
    }

    @Override
    public String editar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String eliminar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getPuntos() {
        return puntos;
    }

    public void setPuntos(String puntos) {
        this.puntos = puntos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    

    

    
    
    
}
