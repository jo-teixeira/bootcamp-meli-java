package modulo2.aula1.TT.java.com.mercadolibre.crudexample.dto;

import org.springframework.stereotype.Component;

@Component
public class ProdutoDTO {

    private String nome;
    private String marca;
    private Double preco;

    public ProdutoDTO(){}

    public ProdutoDTO(String nome, String marca, Double preco) {
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
