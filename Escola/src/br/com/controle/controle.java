
package br.com.controle;

public class controle {
    private double n1;
    private double n2;
    private double media;
    private double maior;
    private double menor;
    private double aluno;

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

    public double getMaior() {
        return maior;
    }

    public double getMenor() {
        return menor;
    }

    public double calcularMedia() {
        return (this.n1+this.n2)/2;
    }

    public double getAluno() {
        return aluno;
    }

    public void setAluno(double aluno) {
        this.aluno = aluno;
    }
    
    
    
}
