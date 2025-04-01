/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loja_db.Controller;

/**
 *
 * @author User
 */


import com.mycompany.loja_db.Model.ProdutosDAO; 
import com.mycompany.loja_db.Model.Produtos;


public class ProdutosController {
    private ProdutosDAO usuarioDAO = new ProdutosDAO();

    public ProdutosDAO registrarProdutos(String produto, String descricao, int quant, double preco) {
        return ProdutosDAO.registrarProduto(produto, descricao, quant, preco);
    }

    public Usuario validarLogin(String nome, String senha) {
        return usuarioDAO.validarLogin(nome, senha);
    }
    
    public Usuario login(String nome, String senha) {
        return usuarioDAO.validarLogin(nome, senha); 
    }
}