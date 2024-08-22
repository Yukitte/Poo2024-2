/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controle;

public class Controle {
    private double valor;
    private double maior;
    private double soma;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
        if(this.valor >this.maior){
            this.maior = this.valor;
        }
        this.soma+=this.valor;
    }

    public double getMaior() {
        return maior;
    }

    public double getSoma() {
        return soma;
    }

}
