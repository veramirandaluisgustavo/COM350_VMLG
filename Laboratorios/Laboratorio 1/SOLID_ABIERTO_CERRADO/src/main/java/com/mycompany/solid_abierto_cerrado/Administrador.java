/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.solid_abierto_cerrado;

/**
 *
 * @author HP
 */
public class Administrador extends Usuario {
    String password,rol;

    public Administrador(String password, String rol, String nombres, String apellidos, String sexo, String direccion, String correo, String celular) {
        super(nombres, apellidos, sexo, direccion, correo, celular);
        this.password = password;
        this.rol = rol;
    }

    

    @Override
    public String crear() {
        return "INSERT INTO administradores (password,rol,id_usuario) VALUES('"+this.password+"','"+this.rol+"','"+this.id+"')";
    }

    @Override
    public String editar() {
        String respuesta=null;
        if(this.id != 0){
            respuesta = "UPDATE administradores SET password = '"+this.password+"', rol = '"+this.rol+"' WHERE administradores.id = "+this.id;
        }
        
        return respuesta;
    }

    @Override
    public String eliminar() {
        String respuesta=null;
        if(this.id != 0){
            respuesta = "DELETE FROM administradores WHERE id_usuario = "+this.id;
        }
        
        return respuesta;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    
    
    
}
