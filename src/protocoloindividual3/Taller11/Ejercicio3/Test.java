/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protocoloindividual3.Taller11.Ejercicio3;

/**
 *
 * @author juana
 */
public class Test {
    
    public static void main(String[] args) {
        
        /*
        Animal miAnimal = new Animal();
        miAnimal.dormir();
        */
        
        Figura rectangulo = new Rectangulo(4, 5);
        System.out.println("Ejercicio 3");
        System.out.println("");
        System.out.println("Perimetro del rectangulo: " + rectangulo.calcularPerimetro());
    }
}
