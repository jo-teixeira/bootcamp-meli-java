package modulo2.aula1.TT.java.com.mercadolibre.crudexample.repositories;

import modulo2.aula1.TT.java.com.mercadolibre.crudexample.dto.ProdutoDTO;
import modulo2.aula1.TT.java.com.mercadolibre.crudexample.models.Produto;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.stereotype.Component;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProdutoRepository {

    private JSONArray readJson() {
        JSONParser jsonParser = new JSONParser();

        try (FileReader reader = new FileReader("produtos.json")) {
            Object obj = jsonParser.parse(reader);
            return (JSONArray) obj;
        } catch (Exception e) {

        }
        return null;
    }

    public List<Produto> getObjectsFromJson() {
        try {
            return (ArrayList<Produto>) readJson().stream().map(produto -> parseProdutoOjbect((JSONObject) produto)).collect(Collectors.toList());
        } catch (Exception e) {
            return null;
        }

    }

    private Produto parseProdutoOjbect(JSONObject obj) {

        Long id = (Long) obj.get("id");
        String nome = (String) obj.get("nome");
        String marca = (String) obj.get("marca");
        Double preco = (Double) obj.get("preco");

        return new Produto(id, nome, marca, preco);
    }

    public Produto findById(Long id) {
        try {
            return getObjectsFromJson().stream().filter(elem -> elem.getId().equals(id)).findFirst().get();
        } catch (Exception e) {
            return null;
        }
    }

    public String criarProduto(ProdutoDTO produto) {
        JSONArray jsonArray = readJson();
        Long maxId = (Long) ((JSONObject) jsonArray.get(jsonArray.size() - 1)).get("id");
        JSONObject novoProduto = new JSONObject();
        novoProduto.put("id", maxId + 1);
        novoProduto.put("nome", produto.getNome());
        novoProduto.put("marca", produto.getMarca());
        novoProduto.put("preco", produto.getPreco());
        jsonArray.add(novoProduto);

        escreverJson(jsonArray);


        return ((Long) (maxId + 1)).toString();
    }

    private void escreverJson(JSONArray jsonArray) {
        try (FileWriter file = new FileWriter("produtos.json")) {
            file.write(jsonArray.toJSONString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean deletarProduto(Long id) {
        JSONArray jsonArray = readJson();
        JSONArray jsonFinal = new JSONArray();
        boolean deleted = true;
        for (int i = 0; i < jsonArray.size(); i++) {
            if (!((JSONObject) jsonArray.get(i)).get("id").equals(id)) {
                jsonFinal.add(jsonArray.get(i));
            }
        }
        if (jsonFinal.size() == jsonArray.size()) {
            deleted = false;
        }

        escreverJson(jsonFinal);

        return deleted;
    }

    public String atualizarProduto(Produto produto){
        JSONArray jsonArray = readJson();
        for (int i = 0; i < jsonArray.size(); i++) {
            if (((JSONObject) jsonArray.get(i)).get("id").equals(produto.getId())) {
                JSONObject elementoParaAtualizar = (JSONObject) jsonArray.get(i);
                elementoParaAtualizar.replace("nome",produto.getNome());
                elementoParaAtualizar.replace("marca",produto.getMarca());
                elementoParaAtualizar.replace("preco",produto.getPreco());
                escreverJson(jsonArray);
                return produto.getId().toString();
            }
        }
        return null;
    }
}
