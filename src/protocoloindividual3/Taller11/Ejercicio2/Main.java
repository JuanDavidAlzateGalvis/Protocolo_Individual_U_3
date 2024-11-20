/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protocoloindividual3.Taller11.Ejercicio2;

/**
 *
 * @author juana
 */
public class Main {
    
    public static void main(String[] args) {
        
        Empleado gerente = new Gerente("Juan", 80000.0);
        Empleado vendedor = new Vendedor("Alzate", 400000.0, 0.1);

        System.out.println("Ejercicio 2");
        System.out.println("");
        gerente.mostrarDetalles();
        vendedor.mostrarDetalles();
    }
}
