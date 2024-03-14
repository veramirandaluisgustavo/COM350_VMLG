/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.solid_abierto_cerrado;

/**
 *
 * @author HP
 */
public class Proveedor extends Usuario{
    String nit,codigo;

    public Proveedor(String nit, String codigo, String nombres, String apellidos, String sexo, String direccion, String correo, String celular) {
        super(nombres, apellidos, sexo, direccion, correo, celular);
        this.nit = nit;
        this.codigo = codigo;
        this.id=0;
        
        
        
    }

    @Override
    public String crear() {
        return "INSERT INTO proveedores (nit,codigo,id_usuario) VALUES('"+this.nit+"','"+this.codigo+"','"+this.id+"')";
    }

    @Override
    public String editar() {
        String respuesta=null;
        if(this.id != 0){
            respuesta = "UPDATE proveedores SET nit = '"+this.nit+"', codigo = '"+this.codigo+"' WHERE proveedores.id = "+this.id;
        }
        
        return respuesta;
    }

    @Override
    public String eliminar() {
        String respuesta=null;
        if(this.id != 0){
            respuesta = "DELETE FROM proveedores WHERE id_usuario = "+this.id;
        }
        
        return respuesta;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    
}
