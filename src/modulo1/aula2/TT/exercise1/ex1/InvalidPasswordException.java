package aula2.TT.exercise1.ex1;

public class InvalidPasswordException extends RuntimeException{
    public InvalidPasswordException(String erro) {
        super(erro);
    }
}
