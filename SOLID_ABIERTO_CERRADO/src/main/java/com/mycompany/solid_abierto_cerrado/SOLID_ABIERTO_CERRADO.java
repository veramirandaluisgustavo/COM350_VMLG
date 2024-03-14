/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.solid_abierto_cerrado;

/**
 *
 * @author HP
 */
public class SOLID_ABIERTO_CERRADO {

    public static void main(String[] args) {
        DB_Controller controller=new DB_Controller();
        Cliente cliente1=new Cliente("15","gre43","luis alberto","zalzar guitierrez","masculino","plaza 25 de mayo",
                "alguien@gmail.com","083280");
        controller.crear(cliente1);
        
    }
    
}
