package com.mycompany.zoologico.factories;


import Interfaces.IAve;
import Interfaces.IAnimalFactory;
import Interfaces.IMamifero;
import com.mycompany.zoologico.mamiferos.Leon;
import com.mycompany.zoologico.mamiferos.Mono;
import Interfaces.IPez;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class MamiferoFactory implements IAnimalFactory {
    
    
        
    String nombre;
    double temperatura;
    int numeroPatas;
    String color;
    

    @Override
    public IMamifero createMamifero(String animal) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca el nombre del animal");
        this.nombre=sc.next();
        System.out.println("Introduzca el color del animal");
        this.color=sc.next();
        System.out.println("Introduzca el la temperatura del animal del animal");
        this.temperatura=sc.nextDouble();
        System.out.println("Introduzca el numero de patas del animal");
        this.numeroPatas=sc.nextInt();
        
        IMamifero make=null;
        switch(animal){
            case "leon":
                make=new Leon(this.nombre,this.temperatura,this.numeroPatas,this.color);
                System.out.println("Leon creado");
                break;
            case "mono":
                make=new Mono(this.nombre,this.temperatura,this.numeroPatas,this.color);
                System.out.println("Mono creado");
                break;
            case "oso":
                make=new Leon(this.nombre,this.temperatura,this.numeroPatas,this.color);
                System.out.println("Oso creado");
                break;
            default:
                System.out.println("animal no es correcto");
                break;
        }
        return make;
    }

    @Override
    public IPez createPez(String animal) {
        return null;
    }

    @Override
    public IAve createAve(String animal) {
        return null;
    }


    
}
