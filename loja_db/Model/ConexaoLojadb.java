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

public class ConexaoLojadb {
    private static final String url = "jdbc:mysql://localhost:3306/lojadb";
    private static final String usuario = "root";
    private static final String senha = "root";
    private static Connection connection;

    public static Connection conectar() {
        try {
            if (connection == null || connection.isClosed()) {
                connection = DriverManager.getConnection(url, usuario, senha);
            }
            return connection;
        } catch (SQLException error) {
            throw new RuntimeException("Erro na conexão com o banco de dados", error);
        }
    }

    private static void criarTabelaProdutos() {
        String sql = "CREATE TABLE IF NOT EXISTS produtos (" +
                     "id INT AUTO_INCREMENT PRIMARY KEY, " +
                     "nome VARCHAR(100) NOT NULL, " +
                     "descrição TEXT NOT NULL), " +
                     "preço DECIMAL (10,2) NOT NULL, " +
                     "quantidade INT NOT NULL";
                try (Statement stmt = connection.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException error) {
            throw new RuntimeException("Erro ao criar a tabela", error);
        }
    }
}