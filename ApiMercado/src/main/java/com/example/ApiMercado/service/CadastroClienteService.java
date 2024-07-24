package com.example.ApiMercado.service;

import com.example.ApiMercado.dto.CadastroClienteDTO;
import org.springframework.stereotype.Service;

@Service
public class CadastroClienteService {

    public CadastroClienteDTO retornoClientes(CadastroClienteDTO cadastroClienteDTO){

        String CPF = cadastroClienteDTO.getCPF();
        String nome_do_cliente = cadastroClienteDTO.getNome_do_cliente();
        String email_do_cliente = cadastroClienteDTO.getEmail_do_cliente();
        String telefone =  cadastroClienteDTO.getTelefone();

        CadastroClienteDTO retorno = new CadastroClienteDTO();

        retorno.setCPF(CPF);
        retorno.setNome_do_cliente(nome_do_cliente);
        retorno.setEmail_do_cliente(email_do_cliente);
        retorno.setTelefone(telefone);

        return retorno;
    }
}
