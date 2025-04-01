/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loja_db.Model;

/**
 *
 * @author VINICIUSDASILVATEIXE
 */
public class Produtos {
    private int id;
    private String produto;
    private int quant; 
    private double preco; 

    public Produtos() {
    }

    public Produtos(int id, String produto, int quant, double preco) {
        this.id = id; 
        this.produto = produto; 
        this.quant = quant; 
        this.preco = preco; 
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }
    
    public int getQuant() {
        return quant; 
    }
    
    public void setQuant(int quant) {
        this.quant = quant; 
    }
    
    public double getPreco() {
        return preco; 
    }
    
    public void setPreco(double preco) {
        this.preco = preco; 
    }
}