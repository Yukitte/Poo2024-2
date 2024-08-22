
package br.com.visao;
import br.com.controle.Controle;
import javax.swing.JOptionPane;


public class Visao {
    public static void main(String[]args){
        int cont;
        Controle c = new Controle();
        for(cont=0; cont <3; cont ++){
        c.setValor(Double.valueOf(JOptionPane.showInputDialog("Digite o valor:")));
                }
        JOptionPane.showMessageDialog(null, "O maior numero é :"+c.getMaior());
        JOptionPane.showMessageDialog(null, "A soma é :"+c.getSoma());
    }
    
}
//Receber duas notas de 10 alunos , anotar a maior, a menor e a media delas