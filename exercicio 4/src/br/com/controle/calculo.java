
package br.com.controle;

public class calculo {
    private double n1;
    private double n2;

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }
    
public double somar(){
    return this.n1-this.n2;
}    
public double subtrair(){
    return this.n1-this.n2;
}  
public double dividir(){
    return this.n1/this.n2;
}  
public double multiplicar(){
    return this.n1*this.n2;
}
}
