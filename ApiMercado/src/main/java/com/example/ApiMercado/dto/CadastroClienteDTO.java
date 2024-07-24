package com.example.ApiMercado.dto;

import lombok.Setter;

public class CadastroClienteDTO {


    private String CPF;
    private String nome_do_cliente;
    private String email_do_cliente;
    private String telefone;

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome_do_cliente() {
        return nome_do_cliente;
    }

    public void setNome_do_cliente(String nome_do_cliente) {
        this.nome_do_cliente = nome_do_cliente;
    }

    public String getEmail_do_cliente() {
        return email_do_cliente;
    }

    public void setEmail_do_cliente(String email_do_cliente) {
        this.email_do_cliente = email_do_cliente;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
