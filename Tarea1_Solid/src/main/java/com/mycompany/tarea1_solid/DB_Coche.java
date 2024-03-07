/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea1_solid;

import com.sun.jdi.connect.spi.Connection;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public class DB_Coche {
    private  java.sql.Connection con;
    // Declaramos los datos de conexion a la bd
    private  String driver="com.mysql.jdbc.Driver";
    private  String user="root";
    private  String pass="";
    private  String url="jdbc:mysql://localhost:3308/solid";
    DB_Coche(){
        conector();
    }
    public void conector() {
        // Reseteamos a null la conexion a la bd
        con=null;
        try{
            Class.forName(driver);
            // Nos conectamos a la bd
            con= (java.sql.Connection) DriverManager.getConnection(url, user, pass);
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
    public void guardarCoche(Coche coche) throws SQLException{
        String consulta = "INSERT INTO coche (nombre,modelo,marca,placa,cilindrada) VALUES (?, ?,?,?,?)";
        PreparedStatement statement = con.prepareStatement(consulta);
            // Establecer los parámetros
            statement.setString(1, coche.getNombre());
            statement.setString(2, coche.getModelo());
            statement.setString(3, coche.getMarca());
            statement.setString(4, coche.getPlaca());
            statement.setString(5, String.valueOf(coche.getCilindrada()));
            
        

            // Ejecutar la inserción
            int filasInsertadas = statement.executeUpdate();

            // Verificar si la inserción fue exitosa
            if (filasInsertadas > 0) {
                System.out.println("Inserción exitosa.");
            } else {
                System.out.println("No se pudo insertar el registro.");
            }

            // Cerrar la conexión y liberar recursos
            statement.close();
        
    }
}
