package com.example.ApiMercado.dto;

public class CadastroProdutoDTO {

    private Integer produto_id;
    private String nome_produtos;
    private Float preco;
    private String categoria;
    private Integer quantidade_estoque;

    public Integer getProduto_id() {
        return produto_id;
    }

    public void setProduto_id(Integer produto_id) {
        this.produto_id = produto_id;
    }

    public String getNome_produtos() {
        return nome_produtos;
    }

    public void setNome_produtos(String nome_produtos) {
        this.nome_produtos = nome_produtos;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Integer getQuantidade_estoque() {
        return quantidade_estoque;
    }

    public void setQuantidade_estoque(Integer quantidade_estoque) {
        this.quantidade_estoque = quantidade_estoque;
    }
}
