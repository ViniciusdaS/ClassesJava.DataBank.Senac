/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author VINICIUSDASILVATEIXE
 */

import org.mindrot.jbcrypt.BCrypt;
import java.sql.*;


public class UsuarioDAO {
    public UsuarioDAO registrarUsuario(String usuario, String senha) {
        String sql = "INSERT INTO usuarios (usuario, senha) VALUES (?, ?)";
        String senhaHash = BCrypt.hashpw(senha, BCrypt.gensalt());

        try (Connection connection = Conexao.conectar();
             PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, usuario);
            stmt.setString(2, senhaHash);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Usuario validarLogin(String nome, String senha) {
        String sql = "SELECT * FROM usuarios WHERE nome = ? AND senha = ?";

        try (Connection connection = Conexao.conectar();
             PreparedStatement stmt = connection.prepareStatement(sql)) {
            
            stmt.setString(1, nome);
            stmt.setString(2, senha);
            ResultSet rs = stmt.executeQuery(); 
            
            if (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setNome("nome");
                usuario.setSenha("senha");
                return usuario;
            }
        } catch (SQLException error){
            error.printStackTrace();
        }
        return null; 
    }
}
