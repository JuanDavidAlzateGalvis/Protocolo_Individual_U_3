/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protocoloindividual3.Taller11.Ejercicio1;

/**
 *
 * @author juana
 */
public class Rectangulo extends Figura {
    
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura; 
    }
    
    @Override
    public String obtenerNombre() {
        return "rectangulo"; }

    @Override
    public double calcularArea() {
        return base * altura; }
}
