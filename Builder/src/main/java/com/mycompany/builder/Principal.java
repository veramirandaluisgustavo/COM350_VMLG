/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.builder;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Principal {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Cocina cocina=new Cocina();
        Hamburguesa hamburguesa;
        int respuesta;
        
        
        
        System.out.println("elija una hamburguesa para comer");
        System.out.println("1-vegetariana");
        System.out.println("2-simple");
        System.out.println("3-carnivora");
        respuesta = sc.nextInt();
        
        switch(respuesta){
            case 1:
                cocina.setHamburguesaBuilder(new HamburguesaVegetarianaBuilder());
                break;
            case 2:
                cocina.setHamburguesaBuilder(new HamburguesaSimpleBuilder());
                break;
            case 3:
                cocina.setHamburguesaBuilder(new HamburguesaCarnivoraBuilder());
                break;
            default:
                System.out.println("ingrese un valor correcto");
        }
        
        cocina.hacerHamburguesa();
        hamburguesa=cocina.getHamburguesa();
        System.out.println(hamburguesa.toString());
        
    }
}
