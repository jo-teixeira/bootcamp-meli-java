package com.mercadolibre.bootcamp.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONArray;
import org.json.JSONException;
import org.springframework.util.ResourceUtils;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Json {
    private static ObjectMapper mapper = new ObjectMapper();

    public static List read(Class classe, String fileName) {
        File file = null;
        file = new File("src/main/resources/jsons/" + fileName);

//        try {
//            file = ResourceUtils.getFile("classpath:jsons/" + fileName);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

        try {
            List list = mapper.readValue(file, List.class);

            return (List) list.stream().map(x -> mapper.convertValue(x, classe)).collect(Collectors.toList());
        } catch (IOException e) {
            return null;
        }
    }

    public static <T> void write(List<T> lista, String fileName) throws JSONException {
        String jsonString;

        try {
            jsonString = mapper.writeValueAsString(lista);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return;
        }
//        JSONArray jsonArray = new JSONArray();

        try (FileWriter file = new FileWriter("src/main/resources/jsons/" + fileName)) {
            file.write(jsonString);
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
