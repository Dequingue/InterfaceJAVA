/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.ProdutosDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author LUIZ
 */
public class ProdutosDAO {
Connection con;
PreparedStatement ps;

public void cadastrandoProduto(ProdutosDTO objProdutosdto) {
    String sql = "INSERT INTO produtos (nome, quantidade, preco, descricao) VALUES (?, ?, ?, ?)";

    con = new Conexao().getCon();
    if (con == null) {
        JOptionPane.showMessageDialog(null, "Falha na conexão com o banco de dados.");
        return;
    }

    try {
        ps = con.prepareStatement(sql);
        ps.setString(1, objProdutosdto.getNome_produto());
        ps.setInt(2, objProdutosdto.getQuantidade_produto());
        ps.setDouble(3, objProdutosdto.getPreco_produto()); // alterado de setInt para setDouble
        ps.setString(4, objProdutosdto.getDescricao_produto());
 

        ps.execute();
        JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Erro ao cadastrar produto: " + e.getMessage());
    } finally {
        try {
            if (ps != null) ps.close();
            if (con != null) con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar recursos: " + e.getMessage());
        }
    }
}
        
      
}
