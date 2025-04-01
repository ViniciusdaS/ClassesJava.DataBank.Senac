/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loja_db.Model;

/**
 *
 * @author VINICIUSDASILVATEIXE
 */

import org.mindrot.jbcrypt.BCrypt;
import java.sql.*;
import com.mycompany.loja_db.Model.Usuario; 


public class UsuarioDAO {
    public boolean registrarUsuario(String usuario, String senha) {
        
        String sql = "INSERT INTO usuarios (usuario, senha) VALUES (?, ?)";
        String senhaHash = BCrypt.hashpw(senha, BCrypt.gensalt());

        try (Connection connection = ConexaoLojadb.conectar();
             PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, usuario);
            stmt.setString(2, senhaHash);
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean validarLogin(String nome, String senha) {
        String sql = "SELECT senha FROM usuarios WHERE nome = ?";

        try (Connection connection = ConexaoLojadb.conectar();
             PreparedStatement stmt = connection.prepareStatement(sql)) {
            
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery(); 
            
            if (rs.next()) {
                return BCrypt.checkpw(senha, rs.getString("senha"));
            }
        } catch (SQLException error){
            error.printStackTrace();
        }
        return false;
    }
}