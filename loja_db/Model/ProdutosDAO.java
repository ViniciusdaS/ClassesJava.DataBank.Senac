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

    public boolean registrarProduto(String produto, String descricao, double preco, int quant) {
        String sql = "INSERT INTO produtos (produto, descrição, preço, quantidade) VALUES (?, ?, ?, ?)";

        try (Connection connection = ConexaoLojadb.conectar(); PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, produto);
            stmt.setString(2, descricao);
            stmt.setDouble(3, preco);
            stmt.setInt(4, quant);
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public List<Produtos> listar() {
        ArrayList<Produtos> produtos = new ArrayList<>();
        String sql = "SELECT * FROM produtos";
        try (Connection conn = ConexaoLojadb.conectar(); PreparedStatement stmt = conn.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {

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
