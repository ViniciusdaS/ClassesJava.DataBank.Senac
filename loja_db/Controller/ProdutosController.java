/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author User
 */

import java.util.List; 
import Model.ProdutosDAO; 
import Model.Produtos; 

public class ProdutosController {
    private ProdutosDAO produtosDAO = new ProdutosDAO);
    
    public ProdutosDAO cadastrarProdutos(int id, String produto, String descricao, int quant, double preco) {
        Produtos produtos = new Produtos(id, produto, descricao, quant, preco);
        return produtosDAO.registrarProduto(produto);
    }
    
    public List(Produtos) listarProdutos() {
        return produtosDAO.
    }

}
