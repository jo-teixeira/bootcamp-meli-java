package class4.list3.ex1;

public class WeakPassword extends Password {
    public WeakPassword() {
        super("^(?=.*).{6,20}$");
    }
}
