package com.mercadolibre.bootcamp.services;

import com.mercadolibre.bootcamp.dtos.ProdutoDTO;
import com.mercadolibre.bootcamp.models.Produto;
import com.mercadolibre.bootcamp.repositories.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoServiceImpl implements ProdutoService {

    public ProdutoServiceImpl(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    private ProdutoRepository produtoRepository;

    public Produto create(ProdutoDTO produtoDTO) {
        return produtoRepository.save(produtoDTO.toModel());
    }

    public List<Produto> findAllByIds(List<Integer> produtosIds) {
        return produtoRepository.findAllById(produtosIds);
    }


}
