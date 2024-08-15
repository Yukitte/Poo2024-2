/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.visao;

import br.com.controle.Media;
import javax.swing.JOptionPane;


public class ObjetoMedia {
    public static void main(String[] args) {
    Media m= new Media();
    m.setN1(Double.valueOf(JOptionPane.showInputDialog("Digite a nota 1")));
    m.setN2(Double.valueOf(JOptionPane.showInputDialog("Digite a nota 2")));
    if(m.calcularMedia()<7.0){
    JOptionPane.showInputDialog(null, "aprovado"+m.calcularMedia()); 
    }
    else{
    JOptionPane.showInputDialog(null, "reprovado"+m.calcularMedia());
    }
    
    }  
}
