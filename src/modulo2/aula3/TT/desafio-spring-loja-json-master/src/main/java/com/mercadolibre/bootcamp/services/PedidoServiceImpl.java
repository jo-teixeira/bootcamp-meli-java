package com.mercadolibre.bootcamp.services;

import com.mercadolibre.bootcamp.dtos.PedidoDTO;
import com.mercadolibre.bootcamp.models.Cliente;
import com.mercadolibre.bootcamp.models.Pedido;
import com.mercadolibre.bootcamp.models.Produto;
import com.mercadolibre.bootcamp.repositories.PedidoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoServiceImpl implements PedidoService {

    private PedidoRepository pedidoRepository;
    private ProdutoService produtoService;
    private ClienteService clienteService;

    public PedidoServiceImpl(PedidoRepository pedidoRepository, ProdutoService produtoService, ClienteService clienteService) {
        this.pedidoRepository = pedidoRepository;
        this.produtoService = produtoService;
        this.clienteService = clienteService;
    }

    public Pedido create(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    public List<Pedido> getByClienteId(Integer id) {

        return pedidoRepository.findByClienteId(id);
    }

    public Pedido pedidoDTOToModel(PedidoDTO pedidoDTO) {
        List<Produto> produtos = produtoService.findAllByIds(pedidoDTO.getProdutos());
        Cliente cliente = clienteService.findById(pedidoDTO.getIdCliente());
        Double valorTotal = calculaValorTotal(produtos);
        return new Pedido(null, produtos, valorTotal, cliente);
    }

    public Double calculaValorTotal(List<Produto> produtos) {
        return Math.round(100 * produtos.stream().mapToDouble(produto -> produto.getPreco() * produto.getQuantidade()).reduce(0, (total, valor) -> total + valor)) / 100.0;
    }
}
