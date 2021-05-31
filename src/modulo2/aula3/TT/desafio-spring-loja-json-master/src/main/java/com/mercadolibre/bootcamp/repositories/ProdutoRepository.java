package com.mercadolibre.bootcamp.repositories;

import com.mercadolibre.bootcamp.models.Produto;

import java.util.List;

public interface ProdutoRepository {
    Produto save(Produto toModel);

    List<Produto> findAllById(List<Integer> produtosIds);
}
