/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protocoloindividual3.Taller11.Ejercicio1;

/**
 *
 * @author juana
 */
public class Main {
    
    public static void main(String[] args) {
        
        Figura circulo = new Circulo(4.0);
        Figura rectangulo = new Rectangulo(5.0, 8.0);

        System.out.println("Ejercicio 1");
        System.out.println("");
        circulo.mostrarArea();
        rectangulo.mostrarArea();
    }
}
