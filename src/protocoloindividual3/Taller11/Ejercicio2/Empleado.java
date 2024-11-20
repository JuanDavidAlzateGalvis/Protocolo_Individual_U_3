/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protocoloindividual3.Taller11.Ejercicio2;

/**
 *
 * @author juana
 */
public abstract class Empleado {
    
    private String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre; }

    public abstract double calcularSalario();

    public void mostrarDetalles() {
        System.out.println("Empleado: " + nombre + ", Salario: " + calcularSalario()); }
}
