/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author VINICIUSDASILVATEIXE
 */
import java.sql.*; 

public class Conexao {
    private static final String URL = "jdbc:mysql://localhost:3306/lojagosling";
    private static final String USUARIO = "root";
    private static final String SENHA = "root";
    private static Connection connection;

    public static Connection conectar() {
        try {
            if (connection == null || connection.isClosed()) {
                connection = DriverManager.getConnection(URL, USUARIO, SENHA);
            }
            return connection;
        } catch (SQLException error) {
            throw new RuntimeException("Erro na conexão com o banco de dados", error);
        }
    }

    private static void criarTabelaUsuarios() {
        String sql = "CREATE TABLE IF NOT EXISTS usuarios (" +
                     "id INT AUTO_INCREMENT PRIMARY KEY, " +
                     "nome VARCHAR(100) NOT NULL, " +
                     "senha VARCHAR(100) NOT NULL)";
                try (Statement stmt = connection.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException error) {
            throw new RuntimeException("Erro ao criar a tabela", error);
        }
    }
}
