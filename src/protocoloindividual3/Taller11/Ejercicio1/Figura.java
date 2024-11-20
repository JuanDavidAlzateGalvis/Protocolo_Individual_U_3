/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protocoloindividual3.Taller11.Ejercicio1;

/**
 *
 * @author juana
 */
public abstract class Figura {
    
    public abstract double calcularArea();
    public abstract String obtenerNombre();

    public void mostrarArea() {
        System.out.println("El area del " + obtenerNombre() + " es: " + calcularArea()); }
}
