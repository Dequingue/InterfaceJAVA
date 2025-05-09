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
    
    public void cadastrandoProduto(ProdutosDTO objProdutosdto){
        String sql = "insert into produtos (nome,quantidade,preco,descricao,usuario_id,categoria_id) values(?,?,?,?,?,?)";
        
        con = new Conexao().getCon();
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, objProdutosdto.getNome_produto());
            ps.setInt(2, objProdutosdto.getQuantidade_produto());
            ps.setInt(3, objProdutosdto.getPreco_produto());
            ps.setString(4, objProdutosdto.getDescricao_produto());
            ps.setInt(5, objProdutosdto.getUsuario_id());
            ps.setInt(6, objProdutosdto.getCategoria_id());
            
            ps.execute();
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Erro produtosDAO" +e);
        }
    }
        
      
}
