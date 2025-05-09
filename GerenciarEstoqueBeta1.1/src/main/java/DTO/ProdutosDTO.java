/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author LUIZ
 */
public class ProdutosDTO {
    private String nome_produto, descricao_produto;
    private int quantidade_produto, preco_produto,usuario_id, categoria_id;

    public String getNome_produto() {
        return nome_produto;
    }

    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    public int getQuantidade_produto() {
        return quantidade_produto;
    }

    public void setQuantidade_produto(int quantidade_produto) {
        this.quantidade_produto = quantidade_produto;
    }

    public int getPreco_produto() {
        return preco_produto;
    }

    public void setPreco_produto(int preco_produto) {
        this.preco_produto = preco_produto;
    }

    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }

    public int getCategoria_id() {
        return categoria_id;
    }

    public void setCategoria_id(int categoria_id) {
        this.categoria_id = categoria_id;
    }

    public String getDescricao_produto() {
        return descricao_produto;
    }
    public void setDescricao_produto(String descricao_produto ){
        this.descricao_produto = descricao_produto;
    }
    
    
}
