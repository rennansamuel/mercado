package com.example.ApiMercado.service;

import com.example.ApiMercado.dto.VendaProdutoDTO;
import org.springframework.stereotype.Service;

@Service
public class VendaProdutoService {

    public VendaProdutoDTO retornaVendas(VendaProdutoDTO vendaProdutoDTO){

        Integer id_venda_produto = vendaProdutoDTO.getId_venda_produto();
        Integer pedidos_id = vendaProdutoDTO.getPedidos_id();
        Integer produto_id = vendaProdutoDTO.getPedidos_id();

        VendaProdutoDTO retorno = new VendaProdutoDTO();

        retorno.setId_venda_produto(id_venda_produto);
        retorno.setPedidos_id(pedidos_id);
        retorno.setProdutos_id(produto_id);

        return retorno;
    }
}
