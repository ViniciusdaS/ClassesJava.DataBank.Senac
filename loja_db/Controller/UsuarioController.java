/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loja_db.Controller;

import com.mycompany.loja_db.Model.UsuarioDAO;
import com.mycompany.loja_db.Model.Usuario; 

/**
 *
 * @author VINICIUSDASILVATEIXE
 */


public class UsuarioController {
    private UsuarioDAO usuarioDAO = new UsuarioDAO();

    public boolean registrarUsuario(String nome, String senha) {
        return usuarioDAO.registrarUsuario(nome, senha);
    }

    public boolean validarLogin(String nome, String senha) {
        return usuarioDAO.validarLogin(nome, senha);
    }
}