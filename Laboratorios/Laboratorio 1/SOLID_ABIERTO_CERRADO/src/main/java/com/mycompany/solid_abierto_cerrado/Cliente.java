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
        return "INSERT INTO clientes (puntos,codigo,id_usuario) VALUES('"+this.puntos+"','"+this.codigo+"','"+this.id+"')";
    }

    @Override
    public String editar() {
        String respuesta=null;
        if(this.id != 0){
            respuesta = "UPDATE clientes SET puntos = '"+this.puntos+"', codigo = '"+this.codigo+"' WHERE clientes.id = "+this.id;
        }
        
        return respuesta;
    }

    @Override
    public String eliminar() {
        String respuesta=null;
        if(this.id != 0){
            respuesta = "DELETE FROM clientes WHERE id_usuario = "+this.id;
        }
        
        return respuesta;
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
