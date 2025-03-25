/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loja_db.Controller;

import com.mycompany.loja_db.Model.ProdutosDAO;

/**
 *
 * @author VINICIUSDASILVATEIXE
 */


public class UsuarioController {
    private ProdutosDAO usuarioDAO = new ProdutosDAO();

    public boolean registrarUsuario(String usuario, String senha) {
        return usuarioDAO.registrarUsuario(usuario, senha);
    }

    public boolean validarLogin(String usuario, String senha) {
        return usuarioDAO.validarLogin(usuario, senha);
    }
}