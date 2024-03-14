/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.solid_abierto_cerrado;

import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public class DB_Controller {

    private Connection con;
    // Declaramos los datos de conexion a la bd
    private String driver = "com.mysql.jdbc.Driver";
    private String user = "root";
    private String pass = "";
    private String url = "jdbc:mysql://localhost:3308/solid_ac";

    public DB_Controller() {
        conector();
    }

    public void crear(Usuario user) {
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

            try {
                query = "SELECT * FROM usuarios WHERE nombres='"+user.getNombres()+"'";
                preparedStatement = con.prepareStatement(query);
                ResultSet resultSet = preparedStatement.executeQuery();

                // Iteramos sobre el ResultSet para obtener los resultados
                while (resultSet.next()) {
                    int resultado=resultSet.getInt("id");
                    user.setId(resultado) ;
                    
                    System.out.println("El id eliminado es: " +user.getId() );
                }
            } catch (SQLException e) {
                System.out.println("error al intentar registrar en la tabla usuarios");
            }

            preparedStatement = con.prepareStatement(user.crear());
            preparedStatement.executeUpdate();
            System.out.println("Usuario registrado correctamente");

        } catch (SQLException e) {
            System.out.println("Error al registrar usuario: " + e.getMessage());
        }

    }
    public void actualizar(Usuario user){
        String respuesta=user.editar();
        if(respuesta != null){
        try {
            // Preparamos la consulta SQL para insertar un nuevo usuario
            String query = "UPDATE usuarios SET nombres = ?, apellidos = ?, sexo = ?, direccion"
                    + " = ?, correo = ?, celular = ? WHERE usuarios.id = ?";
            PreparedStatement preparedStatement = con.prepareStatement(query);
            // Asignamos los valores a los parámetros de la consulta
            preparedStatement.setString(1, user.getNombres());
            preparedStatement.setString(2, user.getApellidos());
            preparedStatement.setString(3, user.getSexo());
            preparedStatement.setString(4, user.getDireccion());
            preparedStatement.setString(5, user.getCorreo());
            preparedStatement.setString(6, user.getCelular());
            preparedStatement.setInt(7, user.getId());
            // Ejecutamos la consulta
            preparedStatement.executeUpdate();

            

            preparedStatement = con.prepareStatement(user.editar());
            preparedStatement.executeUpdate();
            System.out.println("Usuario actualizado correctamente");

        } catch (SQLException e) {
            System.out.println("Error al actualizar usuario: " + e.getMessage());
        }
        }
        else{
            System.out.println("no se selecciono un id para actualizar");
        }
        
    }
    public void eliminar(Usuario user){
        try {
                String query = "SELECT * FROM usuarios WHERE nombres='"+user.getNombres()+"'";
                PreparedStatement preparedStatement = con.prepareStatement(query);
                ResultSet resultSet = preparedStatement.executeQuery();

                // Iteramos sobre el ResultSet para obtener los resultados
                while (resultSet.next()) {
                    int resultado=resultSet.getInt("id");
                    user.setId(resultado) ;
                    
                    System.out.println("El id eliminado es: " +user.getId() );
                }
            } catch (SQLException e) {
                System.out.println("error al intentar buscar en la tabla usuarios");
            }
        if(user.getId() != 0 && user.getNombres().length()>0){
        try {
            String query = "DELETE FROM usuarios WHERE id = ? or nombres = ?";
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.setInt(1, user.getId());
            preparedStatement.setString(2, user.getNombres());
            int rowsDeleted = preparedStatement.executeUpdate();
            preparedStatement.executeUpdate(user.eliminar());
            if (rowsDeleted > 0) {
                System.out.println("Usuario eliminado correctamente");
            } else {
                System.out.println("No se encontró ningún usuario con ese nombre");
            }
        } catch (SQLException e) {
            System.out.println("Error al eliminar usuario: " + e.getMessage());
        }
        }
        else{
            System.out.println("no inserto un nombre o id validos");
        }
        
    }

    private void conector() {
        // Reseteamos a null la conexion a la bd
        con = null;
        try {
            Class.forName(driver);
            // Nos conectamos a la bd
            con = (Connection) DriverManager.getConnection(url, user, pass);
            // Si la conexion fue exitosa mostramos un mensaje de conexion exitosa
            if (con != null) {
                System.out.println("Conexion establecida");
            }
        } // Si la conexion NO fue exitosa mostramos un mensaje de error
        catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error de conexion" + e);
        }
    }

}
