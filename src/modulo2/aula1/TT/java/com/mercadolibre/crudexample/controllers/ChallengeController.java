package modulo2.aula1.TT.java.com.mercadolibre.crudexample.controllers;

import modulo2.aula1.TT.java.com.mercadolibre.crudexample.dto.ProdutoDTO;
import modulo2.aula1.TT.java.com.mercadolibre.crudexample.models.Produto;
import modulo2.aula1.TT.java.com.mercadolibre.crudexample.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/produtos")
public class ChallengeController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping
    public ResponseEntity<List<Produto>> listaProdutos() {

        return ResponseEntity.ok(produtoRepository.getObjectsFromJson());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produto> produtoId(@PathVariable("id") Long id) {
        Produto produto = produtoRepository.findById(id);
        if (produto == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        return ResponseEntity.status(HttpStatus.OK).body(produtoRepository.findById(id));
    }

    @PostMapping
    public ResponseEntity<Void> criarProduto(@RequestBody ProdutoDTO produtoDTO, HttpServletRequest request) {
        return ResponseEntity.created(ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").
                buildAndExpand(produtoRepository.criarProduto(produtoDTO)).toUri()).build();

    }

    @PutMapping
    public ResponseEntity<Void> atualizarProduto(@RequestBody Produto produto, HttpServletRequest request) {
        if (produtoRepository.atualizarProduto(produto).equals(null)) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.created(ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").
                buildAndExpand(produtoRepository.atualizarProduto(produto)).toUri()).build();

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarProduto(@PathVariable("id") Long id) {

        if (!produtoRepository.deletarProduto(id)) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();

    }


}