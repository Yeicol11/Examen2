/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.go.ucr.examen2;

/**
 *
 * @author YeicolR
 */
public class Rango {
    private final double menor;
    private final double mayor;
    private final double valor;

    public Rango(double menor, double mayor, double valor) {
        this.menor = menor;
        this.mayor = mayor;
        this.valor = valor;
    }

    public double getMenor() {
        return menor;
    }

    public double getMayor() {
        return mayor;
    }

    public double getValor() {
        return valor;
    }
    
}