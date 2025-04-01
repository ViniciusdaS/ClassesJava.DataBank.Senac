/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loja_db.Controller;

/**
 *
 * @author User
 */


import com.mycompany.loja_db.Model.Produtos;
import com.mycompany.loja_db.Model.ProdutosDAO; 
import java.util.List;


public class ProdutosController {
    private ProdutosDAO produtosDAO = new ProdutosDAO();

    public boolean registrarProd(String produto, String descricao, int quant, double preco) {
        return produtosDAO.registrarProduto(produto, descricao, preco, quant);
    }
    
    public List<Produtos> listarProdutos() {
        return produtosDAO.listar();
    }
}