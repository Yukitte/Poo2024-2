/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

/**
 *
 * @author gabriel.snovaes
 */
public class quiz {
    private int opcao;
    int soma;
    
    public void setopcao(int opcao) {
        this.opcao = opcao;
        soma++;
    }

    public int somar() {
        return soma;
    }
        
    
}
