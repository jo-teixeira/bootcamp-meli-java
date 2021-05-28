package com.meli.m6a2.repository;

import com.meli.m6a2.exception.PedidoNotFoundException;
import com.meli.m6a2.model.Mesa;
import com.meli.m6a2.model.Pedido;
import com.meli.m6a2.model.Prato;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.*;

@Component
public class PedidoRepository {

    private final Map<Long, List<Pedido>> pedidos = new HashMap<>();


    public List<Pedido> buscaPedidosPorIdMesa(Long id){
        List<Pedido> pedidos = this.pedidos.get(id);

        if(pedidos == null){
            throw new PedidoNotFoundException( String.format( "Pedido com id=%s não foi encontrado", id ));
        }

        return pedidos;
    }

    public void criaPedido(Pedido pedido) {
        Long idMesa = pedido.getMesa().getId();
        List<Pedido> pedidos = this.pedidos.get(idMesa);

        if(pedidos != null){
            pedidos.add(pedido);
        }else{
            pedidos = new ArrayList<>();
            pedidos.add(pedido);
        }

        this.pedidos.put(idMesa, pedidos);
    }
}
