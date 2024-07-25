package com.example.ApiMercado.service;

import com.example.ApiMercado.dto.CadastroProdutoDTO;
import org.springframework.stereotype.Service;

@Service
public class CadastroProdutoService {

    public CadastroProdutoDTO retornaProdutos(CadastroProdutoDTO cadastroProdutoDTO){

        Integer produto_id = cadastroProdutoDTO.getProduto_id();
        String nome_produtos = cadastroProdutoDTO.getNome_produtos();
        Float preco = cadastroProdutoDTO.getPreco();
        String categoria = cadastroProdutoDTO.getCategoria();
        Integer quantidade_estoque = cadastroProdutoDTO.getQuantidade_estoque();

        CadastroProdutoDTO retorno = new CadastroProdutoDTO();

        retorno.setProduto_id(produto_id);
        retorno.setNome_produtos(nome_produtos);
        retorno.setPreco(preco);
        retorno.setCategoria(categoria);
        retorno.setQuantidade_estoque(quantidade_estoque);

        return retorno;
    }
}
