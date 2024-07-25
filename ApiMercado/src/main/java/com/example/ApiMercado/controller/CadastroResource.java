package com.example.ApiMercado.controller;

import com.example.ApiMercado.dto.CadastroClienteDTO;
import com.example.ApiMercado.dto.CadastroProdutoDTO;
import com.example.ApiMercado.service.CadastroClienteService;
import com.example.ApiMercado.service.CadastroProdutoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/mercado")
public class CadastroResource {

    private final CadastroClienteService cadastroClienteService;
    private final CadastroProdutoService cadastroProdutoService;

    @PostMapping("/clientescadastro")
    public ResponseEntity<CadastroClienteDTO> cadastroCliente(@RequestBody CadastroClienteDTO cadastroClienteDTO){

        CadastroClienteDTO retorno = cadastroClienteService.retornoClientes(cadastroClienteDTO);

        return ResponseEntity.ok(retorno);

    }

    @PostMapping("/produtoscadastro")
    public ResponseEntity<CadastroProdutoDTO> cadastroProduto(@RequestBody CadastroProdutoDTO cadastroProdutoDTO){

        CadastroProdutoDTO retorno = cadastroProdutoService.retornaProdutos(cadastroProdutoDTO);

        return ResponseEntity.ok(retorno);

    }

}
