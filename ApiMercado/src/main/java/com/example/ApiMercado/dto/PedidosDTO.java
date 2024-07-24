package com.example.ApiMercado.dto;

import java.sql.Timestamp;

public class PedidosDTO {

    private Integer pedidos_id;
    private String CPF;
    private Timestamp data;

    public Integer getPedidos_id() {
        return pedidos_id;
    }

    public void setPedidos_id(Integer pedidos_id) {
        this.pedidos_id = pedidos_id;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public Timestamp getData() {
        return data;
    }

    public void setData(Timestamp data) {
        this.data = data;
    }
}
