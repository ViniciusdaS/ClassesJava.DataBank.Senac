/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loja_db.Model;

/**
 *
 * @author VINICIUSDASILVATEIXE
 */


import java.sql.*;
import java.util.List; 
import java.util.ArrayList; 

public class ProdutosDAO {
    public Produtos registrarProduto(int id, String produto, String descricao, double preco, int quant) {
        String sql = "INSERT INTO produtos (id, produto, descrição, preço, quantidade) VALUES (?, ?, ?, ?, ?)";

        try (Connection connection = ConexaoLojadb.conectar();
            PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, produto);
            stmt.setString(2, descricao);
            stmt.setDouble(3, preco);
            stmt.setInt(4, quant);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
     public List<Produtos> listar() {
        List<Produtos> produtos = new ArrayList<>();
        String sql = "SELECT * FROM produtos";
        try (Connection conn = ConexaoLojadb.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Produtos produto = new Produtos();
                produto.setId(rs.getInt("id"));
                produto.setProduto(rs.getString("produto"));
                produto.setPreco(rs.getDouble("preco"));
                produto.setQuant(rs.getInt("quantidade"));
                produtos.add(produto);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return produtos;
    }
}
    
   