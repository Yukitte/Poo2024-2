/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidade;

import com.mysql.jdbc.PreparedStatement;
import controle.aluno;

public class ManterAluno extends DAO{
    public void inserir(aluno a )throws  Exception{
        try{
            abrirBanco();
            String query = "insert INTO alunos(codigo,nome,email) "+"values(null,?,?)";
            pst=(PreparedStatement) con.prepareStatement(query);
            pst.setString(1, a.getNome());
            pst.setString(2, a.getEmail());
            pst.execute();
            fecharBanco();
        }catch (Exception e){
            System.out.println("erro"+ e.getMessage());
        }
    }
}
