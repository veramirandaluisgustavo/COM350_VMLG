/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zoologico.factories;

import Interfaces.IAnimalFactory;
import Interfaces.IAve;
import Interfaces.IMamifero;
import Interfaces.IPez;
import com.mycompany.zoologico.peces.Pacu;
import com.mycompany.zoologico.peces.Sabalo;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class PezFactory implements IAnimalFactory{

    @Override
    public IMamifero createMamifero(String animal) {
        return null;
    }

    @Override
    public IPez createPez(String animal) {
        IPez make=null;
        String nombre;
    double longitud;
    Scanner sc=new Scanner(System.in);
    
        System.out.println("Introduzca el nombre del animal");
        nombre=sc.next();
        System.out.println("Introduzca la longitud del animal");
        longitud=sc.nextDouble();
    switch(animal){
        case "pacu":
            make= new Pacu(nombre,longitud);
            System.out.println("Pacu creado correctamente");
            break;
        case "sabalo":
            make= new Sabalo(nombre,longitud);
            System.out.println("Sabalo creado correctamente");
            break;
            
        default:
            System.out.println("Ave no encontrada");
            
  
            
    }
    
    
    return make;
    }

    @Override
    public IAve createAve(String animal) {
        return null;
    }
    
}
