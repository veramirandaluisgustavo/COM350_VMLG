/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zoologico.factories;

import Interfaces.IAnimalFactory;
import com.mycompany.zoologico.Aves.Aguila;
import com.mycompany.zoologico.Aves.Condor;
import Interfaces.IAve;
import com.mycompany.zoologico.Aves.Loro;
import Interfaces.IMamifero;
import Interfaces.IPez;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class AveFactory implements IAnimalFactory {

    @Override
    public IMamifero createMamifero(String animal) {
        return null;
    }

    @Override
    public IPez createPez(String animal) {
        return null;
    }

    @Override
    public IAve createAve(String animal) {
        String nombre;
    IAve make=null;
    double peso;
    double tamanioAlas;
    Scanner sc=new Scanner(System.in);
    
        System.out.println("Introduzca el nombre del animal");
        nombre=sc.next();
        System.out.println("Introduzca el peso del animal");
        peso=sc.nextDouble();
        System.out.println("Introduzca el tamaño de las alas del animal");
        tamanioAlas=sc.nextDouble();
        switch(animal){
            case "aguila":
                make= new Aguila(nombre,peso,tamanioAlas);
                System.out.println("Aguila creada correctamente");
                break;
            case "condor":
                make= new Condor(nombre,peso,tamanioAlas);
                System.out.println("condor creado correctamente");
                break;
            case "loro":
                make= new Loro(nombre,peso,tamanioAlas);
                System.out.println("Loro creado correctamente");
                break;
            default:
                System.out.println("ave no identificada");
                break;
                
                
                
        }
        
     return make;
    }
    
}
