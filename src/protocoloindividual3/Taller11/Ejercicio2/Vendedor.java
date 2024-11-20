/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protocoloindividual3.Taller11.Ejercicio2;

/**
 *
 * @author juana
 */
public class Vendedor extends Empleado {
    
    private double ventas;
    private double comision;

    public Vendedor(String nombre, double ventas, double comision) {
        super(nombre);
        this.ventas = ventas;
        this.comision = comision; 
    }

    @Override
    public double calcularSalario() {
        return ventas * comision; }
}
