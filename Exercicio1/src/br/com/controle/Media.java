/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controle;

public class Media {
    private double valor;
    
    public double getValor(){
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double calcularMedia(){
        return this.valor/2;
    }
}
