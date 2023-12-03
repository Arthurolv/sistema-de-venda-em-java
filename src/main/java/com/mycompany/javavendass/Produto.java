/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javavendass;

public class Produto {
    private String IdProduto;
    private String Descricao;
    private int Preco;
    private int Imposto;
    private String Anotacao;

    public Produto(String IdProduto, String Descricao, int Preco, int Imposto, String Anotacao) {
        this.IdProduto = IdProduto;
        this.Descricao = Descricao;
        this.Preco = Preco;
        this.Imposto = Imposto;
        this.Anotacao = Anotacao;
    }

    public String getIdProduto() {
        return IdProduto;
    }

    public void setIdProduto(String IdProduto) {
        this.IdProduto = IdProduto;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public int getPreco() {
        return Preco;
    }

    public void setPreco(int Preco) {
        this.Preco = Preco;
    }

    public int getImposto() {
        return Imposto;
    }

    public void setImposto(int Imposto) {
        this.Imposto = Imposto;
    }

    public String getAnotacao() {
        return Anotacao;
    }

    public void setAnotacao(String Anotacao) {
        this.Anotacao = Anotacao;
    }
    
    @Override
    public String toString(){
    
        return IdProduto +"|"
               + Descricao +"|"
               + Preco +"|"
               + Imposto +"|"
               + Anotacao;
        
      
    
    }
    
    
}
