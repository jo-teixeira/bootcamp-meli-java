package aula2.TT.exercise1.ex1;

public class StrongPassword extends Password {
    public StrongPassword() {
        super("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,20}$");
    }
}
