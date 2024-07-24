package com.example.ApiMercado.controller;

import com.example.ApiMercado.dto.CadastroClienteDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/cadastros")
public class CadastroResource {

    @PostMapping("/clientes")
    public ResponseEntity<CadastroClienteDTO> cadastroCliente(){

        String CPF = cadastroClienteDTO.getCPF();
        String nome_do_cliente = cadastroClienteDTO.getNome_do_cliente();
        String email_do_cliente = cadastroClienteDTO.getEmail_do_cliente();
        String telefone =  cadastroClienteDTO.getTelefone();
        CadastroClienteDTO retorno = new CadastroClienteDTO();
        retorno.setCPF(CPF);
        retorno.setNome_do_clinte(nome_do_cliente);
        retorno.setEmail_do_cliente(email_do_cliente);
        retorno.setTelefone(telefone);
        return retorno;


    }

}
