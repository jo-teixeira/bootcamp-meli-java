package com.mercadolibre.bootcamp.repositories;

import com.mercadolibre.bootcamp.models.Produto;
import com.mercadolibre.bootcamp.utils.Json;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class ProdutoRepositoryImpl implements ProdutoRepository {
    public Produto save(Produto produto) {
        List<Produto> produtos = Json.read(Produto.class, "produtos.json");
        Integer newId = produtos.size() > 0 ? (produtos.get(produtos.size() - 1).getId() + 1) : 1;
        produto.setId(newId);
        produtos.add(produto);

        try {
            Json.write(produtos, "produtos.json");
            return produto;
        } catch (Exception e) {
            return null;
        }
    }

    public List<Produto> findAllById(List<Integer> produtosIds) {
        List<Produto> produtos = Json.read(Produto.class, "produtos.json");
        return produtos.stream().filter(produto -> produtosIds.contains(produto.getId())).collect(Collectors.toList());
    }
}
