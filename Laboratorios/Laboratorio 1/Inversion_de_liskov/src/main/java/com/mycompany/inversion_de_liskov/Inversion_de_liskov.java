/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inversion_de_liskov;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Inversion_de_liskov {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int respuesta1;
        FiguraGeometrica fig;
        
        
        
        System.out.println("ELIJA UNA OPCION");
        System.out.println("1-crear circulo");
        System.out.println("2-crear Cuadrado");
        System.out.println("3-crear rectangulo");
        System.out.println("4-crear triangulo");
        respuesta1=sc.nextInt();
        switch(respuesta1){
            case 1:
                double radio;
                System.out.println("introduzca el radio del circulo");
                radio=sc.nextDouble();
                fig=new Circulo(radio);
                mostrar(fig);
                break;
            case 2:
                double lado;
                System.out.println("introduzca un lado del cuadrado");
                lado=sc.nextDouble();
                fig=new Cuadrado(lado);
                mostrar(fig);
                break;
            case 3:
                double ladoA,ladoB;
                System.out.println("introduzca un lado del rectangulo");
                ladoA=sc.nextDouble();
                System.out.println("introduzca otro lado del rectangulo");
                ladoB=sc.nextDouble();
                fig=new Rectangulo(ladoA,ladoB);
                mostrar(fig);
                break;
            case 4:
                double lado_A,lado_B,lado_C;
                System.out.println("introduzca un lado del triangulo");
                lado_A=sc.nextDouble();
                System.out.println("introduzca un segundo lado del triangulo");
                lado_B=sc.nextDouble();
                System.out.println("introduzca un tercer lado del triangulo");
                lado_C=sc.nextDouble();
                fig=new Triangulo(lado_A,lado_B,lado_C);
                mostrar(fig);
                break;
             
                
        }
        
        
        
        
    }
    private static void mostrar(FiguraGeometrica fig){
        if(fig != null){
            System.out.println("EL PERIMETRO DE LA FIGURA ES: "+fig.calcularPerimetro());
        System.out.println("EL AREA DE LA FIGURA ES: "+fig.calcularArea());
        }
        
    }
}
