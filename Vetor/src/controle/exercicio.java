/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import java.util.ArrayList;

public class exercicio {
    private int B1;
    private int B2;
    private String nome = null;
    private double cont;
    private double codigo;
    private double maior;

    public int getB1() {
        return B1;
    }

    public int getB2() {
        return B2;
    }
    
    public void adicionarVotos(String nome,int B1,int B2){
        if(B1 >B2){
            maior=B1;
            
        }else{
            maior=B2;
        }
    }
}
