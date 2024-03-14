/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto_solid_calculadora;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Proyecto_solid_calculadora {
    
    public static void main(String[] args) {
        Operaciones op=new Operaciones();
        Calculadora calculadora=new Calculadora(op);
        calculadora.init();
    }
}
