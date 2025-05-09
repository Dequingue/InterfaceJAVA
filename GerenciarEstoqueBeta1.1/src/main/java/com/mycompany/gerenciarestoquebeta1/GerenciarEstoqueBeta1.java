/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gerenciarestoquebeta1;
import DAO.Conexao;
import View.*;
import java.sql.Connection;
import javax.swing.JOptionPane;
/**
 *
 * @author LUIZ
 */
public class GerenciarEstoqueBeta1 {

    public static void main(String[] args) {
        
         Conexao conexao = new Conexao();
        Connection con = conexao.getCon();

        if (con != null) {
            JOptionPane.showMessageDialog(null, "Conexão bem-sucedida!");
            TelaLogin lg = new TelaLogin();
            lg.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao conectar com o banco.");
        }
        
}
}
       

