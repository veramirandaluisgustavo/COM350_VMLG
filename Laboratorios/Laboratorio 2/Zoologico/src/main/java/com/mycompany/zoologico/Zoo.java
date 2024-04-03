/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.zoologico;

import Interfaces.IAnimalFactory;
import com.mycompany.zoologico.factories.AveFactory;
import com.mycompany.zoologico.factories.MamiferoFactory;
import com.mycompany.zoologico.factories.PezFactory;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Zoo {
    

    public static void main(String[] args) {
        
            
        
        Scanner sc=new Scanner(System.in);
        Zoologico zoo;
        zoo=new Zoologico("Animals","Jamine Mendoza n3","3525");
        IAnimalFactory factory;
        while(true){
        
        System.out.println("ELIJA LA OPCION");
        System.out.println("1-Agregar mamifero");
        System.out.println("2-Agregar Ave");
        System.out.println("3-Agregar Pez");
        System.out.println("4-Mostrar Mamiferos");
        System.out.println("5-Mostrar Aves");
        System.out.println("6-Mostrar Peces");
        
        System.out.println("7-Mostrar Zoologico");
        String resp;
        Animal animal;
        
        int respuesta=sc.nextInt();
        switch(respuesta){
            case 1:
                factory=new  MamiferoFactory();
                System.out.println("que mamifero desea?");
                resp=sc.next();
                animal=(Animal) factory.createMamifero(resp);
                zoo.agregarMamifero(animal);
                break;
            case 2:
                factory=new  AveFactory();
                System.out.println("que Ave desea?");
                resp=sc.next();
                animal=(Animal) factory.createAve(resp);
                zoo.agregarAve(animal);
                break;
            case 3:
                factory=new  PezFactory();
                System.out.println("que Pez desea?");
                resp=sc.next();
                animal=(Animal) factory.createAve(resp);
                zoo.agregarPez(animal);
                break;
            case 4:
                zoo.mostrarMamiferos();
                break;
            case 5:
                zoo.mostrarAves();
                break;
            case 6:
                zoo.mostrarPeces();
                break;
            case 7:
                zoo.mostrarZoo();
                break;
            default:
                System.out.println("opcion no correcta");
                break;
                
        }
        }
        
    }
}
