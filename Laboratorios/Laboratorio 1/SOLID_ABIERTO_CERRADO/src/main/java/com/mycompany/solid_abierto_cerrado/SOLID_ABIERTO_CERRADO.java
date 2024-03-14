/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.solid_abierto_cerrado;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class SOLID_ABIERTO_CERRADO {

    public static void main(String[] args) {
        int respuesta,respuesta2;
        Scanner sc =new Scanner(System.in);
        System.out.println("INGRESE LA OPCION QUE DESEE");
        System.out.println("1-Insertar");
        System.out.println("2-Actualizar");
        System.out.println("3-Eliminar");
        respuesta=sc.nextInt();
        System.out.println("sobre que tipo de dato?");
        System.out.println("1-Cliente");
        System.out.println("2-Proveedor");
        System.out.println("3-Administrador");
        respuesta2=sc.nextInt();
        
        
        
        
        switch(respuesta2){
            case 1:
                cliente(respuesta);
                break;
            case 2:
                proveedor(respuesta);
                break;
            case 3:
                administrador(respuesta);
                break;
                
                
        }
        
        
        
        
        
        
        
        
        
        
//        DB_Controller controller=new DB_Controller();
//        Cliente cliente1=new Cliente("1566","gre4366","luis alberto66","zalzar guitierrez66","masculino66","plaza 25 de mayo",
//                "alguien@gmail.com","083280");
//        cliente1.setId(3);
//        controller.eliminar(cliente1);
        
    }
   
    private static void cliente(int opcion){
        DB_Controller controller=new DB_Controller();
        Cliente cliente;
        Scanner sc =new Scanner(System.in);
        String nombres,apellidos,sexo,direccion,correo,celular,puntos,codigo;
        int id;
        switch(opcion){
            case 1:
                System.out.println("ingrese los nombres");
                nombres = sc.next();
                System.out.println("ingrese los apellidos");
                apellidos = sc.next();
                System.out.println("ingrese el sexo");
                sexo = sc.next();
                System.out.println("ingrese la direccion");
                direccion = sc.next();
                System.out.println("ingrese el correo");
                correo = sc.next();
                System.out.println("ingrese el celular");
                celular = sc.next();
                System.out.println("ingrese los puntos");
                puntos = sc.next();
                System.out.println("ingrese el codigo");
                codigo = sc.next();
                cliente = new Cliente(puntos,codigo,nombres,apellidos,sexo,direccion,correo,celular);
                controller.crear(cliente);
                break;
            case 2:
                System.out.println("");
                System.out.println("ingrese los nombres");
                nombres = sc.next();
                System.out.println("ingrese los apellidos");
                apellidos = sc.next();
                System.out.println("ingrese el sexo");
                sexo = sc.next();
                System.out.println("ingrese la direccion");
                direccion = sc.next();
                System.out.println("ingrese el correo");
                correo = sc.next();
                System.out.println("ingrese el celular");
                celular = sc.next();
                System.out.println("ingrese los puntos");
                puntos = sc.next();
                System.out.println("ingrese el codigo");
                codigo = sc.next();
                cliente = new Cliente(puntos,codigo,nombres,apellidos,sexo,direccion,correo,celular);
                System.out.println("Ingrese el ID del cliente");
                id=sc.nextInt();
                cliente.setId(id);
                controller.actualizar(cliente);
                break;
            case 3:
                cliente = new Cliente("","","","","","","","");
                
                System.out.println("ingrese un id a eliminar");
                id=sc.nextInt();
                cliente.setId(id);
                controller.eliminar(cliente);
                break;
                
                
        }
    }
    private static void proveedor(int opcion){
        DB_Controller controller=new DB_Controller();
        Proveedor proveedor;
        Scanner sc =new Scanner(System.in);
        String nombres,apellidos,sexo,direccion,correo,celular,nit,codigo;
        int id;
        switch(opcion){
            case 1:
                System.out.println("ingrese los nombres");
                nombres = sc.next();
                System.out.println("ingrese los apellidos");
                apellidos = sc.next();
                System.out.println("ingrese el sexo");
                sexo = sc.next();
                System.out.println("ingrese la direccion");
                direccion = sc.next();
                System.out.println("ingrese el correo");
                correo = sc.next();
                System.out.println("ingrese el celular");
                celular = sc.next();
                System.out.println("ingrese el NIT");
                nit = sc.next();
                System.out.println("ingrese el codigo");
                codigo = sc.next();
                proveedor = new Proveedor(nit,codigo,nombres,apellidos,sexo,direccion,correo,celular);
                controller.crear(proveedor);
                break;
            case 2:
                System.out.println("");
                System.out.println("ingrese los nombres");
                nombres = sc.next();
                System.out.println("ingrese los apellidos");
                apellidos = sc.next();
                System.out.println("ingrese el sexo");
                sexo = sc.next();
                System.out.println("ingrese la direccion");
                direccion = sc.next();
                System.out.println("ingrese el correo");
                correo = sc.next();
                System.out.println("ingrese el celular");
                celular = sc.next();
                System.out.println("ingrese los puntos");
                nit = sc.next();
                System.out.println("ingrese el codigo");
                codigo = sc.next();
                proveedor = new Proveedor(nit,codigo,nombres,apellidos,sexo,direccion,correo,celular);
                System.out.println("Ingrese el ID del cliente");
                id=sc.nextInt();
                proveedor.setId(id);
                controller.actualizar(proveedor);
                break;
            case 3:
                proveedor = new Proveedor("","","","","","","","");
                
                System.out.println("ingrese un id a eliminar");
                id=sc.nextInt();
                proveedor.setId(id);
                controller.eliminar(proveedor);
                break;
                
                
        }
    }
    private static void administrador(int opcion){
        DB_Controller controller=new DB_Controller();
        Administrador administrador;
        Scanner sc =new Scanner(System.in);
        String nombres,apellidos,sexo,direccion,correo,celular,password,rol;
        int id;
        switch(opcion){
            case 1:
                System.out.println("ingrese los nombres");
                nombres = sc.next();
                System.out.println("ingrese los apellidos");
                apellidos = sc.next();
                System.out.println("ingrese el sexo");
                sexo = sc.next();
                System.out.println("ingrese la direccion");
                direccion = sc.next();
                System.out.println("ingrese el correo");
                correo = sc.next();
                System.out.println("ingrese el celular");
                celular = sc.next();
                System.out.println("ingrese el password");
                password = sc.next();
                System.out.println("ingrese el rol");
                rol = sc.next();
                administrador = new Administrador(password,rol,nombres,apellidos,sexo,direccion,correo,celular);
                controller.crear(administrador);
                break;
            case 2:
                System.out.println("");
                System.out.println("ingrese los nombres");
                nombres = sc.next();
                System.out.println("ingrese los apellidos");
                apellidos = sc.next();
                System.out.println("ingrese el sexo");
                sexo = sc.next();
                System.out.println("ingrese la direccion");
                direccion = sc.next();
                System.out.println("ingrese el correo");
                correo = sc.next();
                System.out.println("ingrese el celular");
                celular = sc.next();
                System.out.println("ingrese los puntos");
                password = sc.next();
                System.out.println("ingrese el codigo");
                rol = sc.next();
                administrador = new Administrador(password,rol,nombres,apellidos,sexo,direccion,correo,celular);
                System.out.println("Ingrese el ID del cliente");
                id=sc.nextInt();
                administrador.setId(id);
                controller.actualizar(administrador);
                break;
            case 3:
                administrador = new Administrador("","","","","","","","");
                
                System.out.println("ingrese un id a eliminar");
                id=sc.nextInt();
                administrador.setId(id);
                controller.eliminar(administrador);
                break;
                
                
        }
    }
    
}
