/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loja_db.Model;

/**
 *
 * @author VINICIUSDASILVATEIXE
 */
public class Usuario {
    private int id;
    private String nome;
    private String senha;

    public boolean Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
        return true;      
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    
}