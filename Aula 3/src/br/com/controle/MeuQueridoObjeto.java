package br.com.controle;
import br.com.visao.Sem;
import javax.swing.JOptionPane;

public class MeuQueridoObjeto {
    public static void main(String[] args) {
        Sem s = new Sem();
      int cont=0;
     for(cont=0; cont<3; cont++){
        s.setValor(Double.valueOf(JOptionPane.showInputDialog("Digite o valor")));
        JOptionPane.showMessageDialog(null," valor "+s.getValor());
         JOptionPane.showMessageDialog(null,"dobro "+s.dobro());
     }
    } 
}
