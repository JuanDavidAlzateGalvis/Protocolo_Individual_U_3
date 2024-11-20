/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protocoloindividual3.Taller12.Ejercicio2;

/**
 *
 * @author juana
 */
public class Pez implements Nadador, Respirador {
    
    @Override
    public void nadar() {
        System.out.println("El pez nada."); }
    
    @Override
    public void respirar() {
        System.out.println("El pez respira."); }
}