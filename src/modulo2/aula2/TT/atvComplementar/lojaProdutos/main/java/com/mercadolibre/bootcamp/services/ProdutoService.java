package com.mercadolibre.bootcamp.services;

import com.mercadolibre.bootcamp.dtos.ProdutoDTO;
import com.mercadolibre.bootcamp.models.Produto;

import java.util.List;

public interface ProdutoService {

    Produto create(ProdutoDTO produtoDTO);

    List<Produto> findAllByIds(List<Integer> produtosIds);
}
