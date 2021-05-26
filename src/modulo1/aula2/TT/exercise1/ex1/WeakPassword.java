package aula2.TT.exercise1.ex1;

public class WeakPassword extends Password {
    public WeakPassword() {
        super("^(?=.*).{6,20}$");
    }
}
