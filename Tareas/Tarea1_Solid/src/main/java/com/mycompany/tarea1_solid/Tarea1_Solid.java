/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tarea1_solid;

import java.io.IOException;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public class Tarea1_Solid {

    public static void main(String[] args) throws IOException, SQLException {
        DB_Coche conection=new DB_Coche();
        Coche coche=new Coche("explorer","ranger","ford","1234few",500);
        conection.guardarCoche(coche);
    }
}
