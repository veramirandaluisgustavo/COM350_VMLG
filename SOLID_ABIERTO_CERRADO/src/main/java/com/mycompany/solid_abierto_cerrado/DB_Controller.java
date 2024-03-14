/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.solid_abierto_cerrado;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public class DB_Controller {
    private  Connection con;
    // Declaramos los datos de conexion a la bd
    private  String driver="com.mysql.jdbc.Driver";
    private  String user="root";
    private  String pass="";
    private  String url="jdbc:mysql://localhost:3308/solid_ac";
    public DB_Controller(){
        conector();
    }
    
    public void crear(Usuario user){
        try {
            // Preparamos la consulta SQL para insertar un nuevo usuario
            String query = "INSERT INTO usuarios (nombres, apellidos,sexo,direccion,correo,celular) VALUES (?,?,?,?,?,?)";
            PreparedStatement preparedStatement = con.prepareStatement(query);
            // Asignamos los valores a los parámetros de la consulta
            preparedStatement.setString(1, user.getNombres());
            preparedStatement.setString(2, user.getApellidos());
            preparedStatement.setString(3, user.getSexo());
            preparedStatement.setString(4, user.getDireccion());
            preparedStatement.setString(5, user.getCorreo());
            preparedStatement.setString(6, user.getCelular());
            // Ejecutamos la consulta
            preparedStatement.executeUpdate();
            System.out.println("Usuario registrado correctamente");
            
            preparedStatement = con.prepareStatement(user.crear());
            preparedStatement.executeUpdate();
            
            
            
            
        } catch (SQLException e) {
            System.out.println("Error al registrar usuario: " + e.getMessage());
        }
        
    }
    
    
    
    
    
    public void conector() {
        // Reseteamos a null la conexion a la bd
        con=null;
        try{
            Class.forName(driver);
            // Nos conectamos a la bd
            con= (Connection) DriverManager.getConnection(url, user, pass);
            // Si la conexion fue exitosa mostramos un mensaje de conexion exitosa
            if (con!=null){
                System.out.println("Conexion establecida");
            }
        }
        // Si la conexion NO fue exitosa mostramos un mensaje de error
        catch (ClassNotFoundException | SQLException e){
            System.out.println("Error de conexion" + e);
        }
    }
    
}
