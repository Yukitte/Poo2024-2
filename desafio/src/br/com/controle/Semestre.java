/*
a)faça um programa que receba de dados de entrada, 
duas notas de aluno e mostre qual a maior media da 
turma e o nome desse aluno.
*//*
b) quantos alunos tiveram media entre 6.0 e 8.0 .
c) qual foi a media da turma.
*/

package br.com.controle;
import java.util.ArrayList;
import java.util.List;


public class Semestre {
    private List<Double> medias = new ArrayList<>();   
    private String alunoM = "";
    private double maior = Double.MIN_VALUE;  
    private int qtd = 0;
    
    //---------------------------------------------
    
    public List<Double> getMedias() {
        return medias;
    }
  
    public String getAluno() {
        return alunoM;
    }

    public void setAluno(String aluno) {
        this.alunoM = aluno;
    }
   
    //---------------------------------------------
    
    //b) quantos alunos tiveram media entre 6.0 e 8.0 .
    public void adicionarNota(String Aluno ,double n1, double n2) 
    {   
        
        double media = (n1+n2)/2;
        medias.add(media);
        if (media >maior){
            maior = media;
            alunoM = Aluno;
        }
        if( media >= 6.0 && media <= 8.0 ){
            qtd++;
        }       
    }
    public double calcularTurma(){
         if(medias.isEmpty()){
             return 0.0;
         }
         double soma = 0;
         for(double media : medias){
             soma +=media;
         }
         return soma/medias.size();
    }
    
    public double calcularMTurma() { 
    if(medias.isEmpty()){
        return 0.0;
    }
    double soma = 0 ;
    for(double media : medias){
        soma+=media;
    }
    return soma/medias.size();
    }

    public double getMaior() {
        return maior;
    }

    public int getQtd() {
        return qtd;
    }
    
    
}