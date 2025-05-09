/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.CategoriaDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno.den
 */
public class CategoriaDAO {
    Connection con;
    PreparedStatement ps;
    
public void cadastroCategoria(CategoriaDTO objcategoriadto){    
    String sql = "INSERT INTO categorias (id,nome) VALUES (?,?)";

        
    con = new Conexao().getCon();
    if (con == null) {
        JOptionPane.showMessageDialog(null, "Falha na conexão com o banco de dados.");
        return;
    }

    try {
        ps = con.prepareStatement(sql);
        ps.setInt(1, objcategoriadto.getId_categoria());
        ps.setString(2, objcategoriadto.getNome_categoria());
    

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
