package com.example.ApiMercado.service;

import com.example.ApiMercado.dto.PedidosDTO;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

@Service
public class PedidosService {

    public PedidosDTO retornoPedidos(PedidosDTO pedidosDTO){

        Integer pedidos_id = pedidosDTO.getPedidos_id();
        String cpf = pedidosDTO.getCPF();
        Timestamp data = pedidosDTO.getData();

        PedidosDTO retorno = new PedidosDTO();

        retorno.setPedidos_id(pedidos_id);
        retorno.setCPF(cpf);
        retorno.setData(data);

        return retorno;
    }
}
