package class4.list3.ex1;

public class InvalidPasswordException extends RuntimeException{
    public InvalidPasswordException(String erro) {
        super(erro);
    }
}
