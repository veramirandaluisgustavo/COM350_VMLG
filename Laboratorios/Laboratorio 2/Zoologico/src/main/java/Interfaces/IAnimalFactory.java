/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Interfaces.IAve;

/**
 *
 * @author HP
 */
public interface IAnimalFactory {
    
    public IMamifero createMamifero(String animal);
    public IPez createPez(String animal);
    public IAve createAve(String animal);
}
