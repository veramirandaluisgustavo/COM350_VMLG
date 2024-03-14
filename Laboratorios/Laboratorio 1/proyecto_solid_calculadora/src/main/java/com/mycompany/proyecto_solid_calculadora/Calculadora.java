/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_solid_calculadora;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Calculadora {
    Operaciones operaciones;
    public Calculadora(Operaciones operaciones){
        this.operaciones=operaciones;
        
    }
    public void init(){
        Scanner sc =new Scanner(System.in);
        
        System.out.println("INTRODUZCA LOS VALORES A OPERAR");
        System.out.println("Valor A");
        float a=sc.nextFloat();
        System.out.println("Valor B");
        float b = sc.nextFloat();
        System.out.println("INTRODUZCA LA OPERACION A REALIZAR");
        System.out.println("1-SUMAR");
        System.out.println("2-RESTAR");
        System.out.println("3-MULTIPLICAR");
        System.out.println("4-DIVIDIR");
        
        int respuesta=sc.nextInt();
        switch(respuesta){
            case 1:
                System.out.println("La respuesta es: "+operaciones.sumar(a,b));break;
            case 2:
                System.out.println("La respuesta es: "+operaciones.restar(a,b));break;
            case 3:
                System.out.println("La respuesta es: "+operaciones.multiplicar(a,b));break;
            case 4:
                System.out.println("La respuesta es: "+operaciones.dividir(a,b));break;
                
        }
    }
    
}
