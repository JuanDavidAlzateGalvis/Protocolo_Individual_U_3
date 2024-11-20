/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protocoloindividual3.Taller12.Ejercicio1_2;

/**
 *
 * @author juana
 */
public class Persona implements Hablador, Trabajador {
    
    @Override
    public void hablar() {
        System.out.println("La persona esta hablando."); }
    
    @Override
    public void trabajar() {
        System.out.println("La persona esta trabajando."); }
}
