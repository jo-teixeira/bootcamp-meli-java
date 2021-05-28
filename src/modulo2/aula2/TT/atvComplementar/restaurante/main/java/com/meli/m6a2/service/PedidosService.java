package com.meli.m6a2.service;

import com.meli.m6a2.builder.PedidoBuilder;
import com.meli.m6a2.model.Mesa;
import com.meli.m6a2.model.Pedido;
import com.meli.m6a2.model.Prato;
import com.meli.m6a2.repository.CaixaRepository;
import com.meli.m6a2.repository.MesaRepository;
import com.meli.m6a2.repository.PedidoRepository;
import com.meli.m6a2.repository.PratoRepository;
import com.meli.m6a2.response.PedidoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PedidosService {

    @Autowired private PedidoRepository pedidoRepository;
    @Autowired private MesaRepository mesaRepository;
    @Autowired private PratoRepository pratoRepository;
    @Autowired private CaixaRepository caixaRepository;


    public PedidoResponse buscaPedidosPorMesa(Long idMesa) {
        List<Pedido> pedidos = pedidoRepository.buscaPedidosPorIdMesa(idMesa);

        return PedidoBuilder.builder(pedidos);

    }

    public void criaPedido(Long idMesa, List<Long> idsPrato){
        Mesa mesa = mesaRepository.buscaMesaPorId(idMesa);
        List<Prato> pratos = pratoRepository.buscaTodosOsPratosPorIds(idsPrato);
        double valorTotal = pratos.stream().mapToDouble(Prato::getPreco).sum();

        Pedido pedido = new Pedido(mesa, pratos, valorTotal);

        pedidoRepository.criaPedido(pedido);

        caixaRepository.atualizaCaixa(valorTotal);
    }
}
