/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zoologico;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class Zoologico {

    String nombre, direccion, telefono;
    List<Jaula> listaMamiferos = new ArrayList<>();
    List<Jaula> listaPeces = new ArrayList<>();
    List<Jaula> listaAves = new ArrayList<>();
    public void mostrarZoo(){
        System.out.println(toString());
    }

    public Zoologico(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public void agregarMamifero(Animal animal) {
        this.listaMamiferos.add(new Jaula(animal, 4, 4, 4));

    }

    public void agregarPez(Animal animal) {
        this.listaPeces.add(new Jaula(animal, 4, 4, 4));

    }

    public void agregarAve(Animal animal) {
        this.listaAves.add(new Jaula(animal, 4, 4, 4));

    }

    public void mostrarMamiferos() {
        System.out.println("----------Mamiferos-----------");
        for (Jaula jaula : this.listaMamiferos) {
            jaula.mostrarAnimal();
        }
        System.out.println("----------FIN_Mamiferos-----------");
        
    }
    public void mostrarAves(){
        System.out.println("----------Aves-----------");
        for (Jaula jaula : this.listaAves) {
            jaula.mostrarAnimal();
        }
        System.out.println("----------FIN_Aves-----------");
        
    }
    public void mostrarPeces(){
        System.out.println("----------Peces-----------");
        for (Jaula jaula : this.listaPeces) {
            jaula.mostrarAnimal();
        }
        System.out.println("----------FIN_Peces-----------");
    }

    @Override
    public String toString() {
        return "Zoologico{" + "nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + '}';
    }

}
