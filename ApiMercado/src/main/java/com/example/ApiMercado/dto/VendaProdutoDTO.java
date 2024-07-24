package com.example.ApiMercado.dto;

public class VendaProdutoDTO {

    private Integer id_venda_produto;
    private Integer pedidos_id;
    private Integer produtos_id;

    public Integer getId_venda_produto() {
        return id_venda_produto;
    }

    public void setId_venda_produto(Integer id_venda_produto) {
        this.id_venda_produto = id_venda_produto;
    }

    public Integer getPedidos_id() {
        return pedidos_id;
    }

    public void setPedidos_id(Integer pedidos_id) {
        this.pedidos_id = pedidos_id;
    }

    public Integer getProdutos_id() {
        return produtos_id;
    }

    public void setProdutos_id(Integer produtos_id) {
        this.produtos_id = produtos_id;
    }
}
