package com.example.ApiMercado.controller;

import com.example.ApiMercado.dto.CadastroClienteDTO;
import com.example.ApiMercado.dto.CadastroProdutoDTO;
import com.example.ApiMercado.dto.PedidosDTO;
import com.example.ApiMercado.dto.VendaProdutoDTO;
import com.example.ApiMercado.service.CadastroClienteService;
import com.example.ApiMercado.service.CadastroProdutoService;
import com.example.ApiMercado.service.PedidosService;
import com.example.ApiMercado.service.VendaProdutoService;
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
    private final VendaProdutoService vendaProdutoService;
    private final PedidosService pedidosService;

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

    @PostMapping("/vendaprodutos")
    public ResponseEntity<VendaProdutoDTO> vendaProduto(@RequestBody VendaProdutoDTO vendaProdutoDTO){

        VendaProdutoDTO  retorno = vendaProdutoService.retornaVendas(vendaProdutoDTO);

        return ResponseEntity.ok(retorno);
    }

    @PostMapping("/pedidos")
    public ResponseEntity<PedidosDTO> pedidos(@RequestBody PedidosDTO pedidosDTO){

        PedidosDTO retorno = pedidosService.retornoPedidos(pedidosDTO);

        return ResponseEntity.ok(retorno);

    }

}
