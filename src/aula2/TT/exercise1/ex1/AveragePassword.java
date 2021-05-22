package aula2.TT.exercise1.ex1;

public class AveragePassword extends Password {
    public AveragePassword() {
        super("^(?=.*[0-9])(?=.*[a-z]).{8,20}$");
    }
}