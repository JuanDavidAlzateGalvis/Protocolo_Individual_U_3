/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protocoloindividual3.Taller13.Ejercicio1;

/**
 *
 * @author juana
 */
public class Main {
    
     public static void main(String[] args) {
        
        Figura rectangulo = new Rectangulo(5.0, 7.0);
        Figura triangulo = new Triangulo(5.0, 6.0);

        System.out.println("Ejercicio 1");
        System.out.println("");
        System.out.println("El area del rectangulo es: " + rectangulo.calcularArea());
        System.out.println("El area del triangulo es: " + triangulo.calcularArea());
    }
}
