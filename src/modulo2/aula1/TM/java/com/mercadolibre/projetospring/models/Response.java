package modulo2.aula1.TM.java.com.mercadolibre.projetospring.models;

import org.springframework.stereotype.Component;

@Component
public class Response {

    private String message;

    public Response() {
    }

    public Response(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
