/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protocoloindividual3.Taller11.Ejercicio2;

/**
 *
 * @author juana
 */
public class Gerente extends Empleado {
    
    private double salarioBase;

    public Gerente(String nombre, double salarioBase) {
        super(nombre);
        this.salarioBase = salarioBase; 
    }

    @Override
    public double calcularSalario() {
        return salarioBase * 1.2; }
}