package class4.list3.ex1;

import java.util.regex.Pattern;

public class Password {
    private String regex;
    private String password;

    public Password(String regex) {
        this.regex = regex;
    }

    private boolean checkPassword(String password) {
        return Pattern.compile(regex).matcher(password).matches();
    }

    public void setValue(String password) {
        if (!checkPassword(password)) {
            throw new InvalidPasswordException("A senha não atende aos requisitos.");
        }

        this.password = password;
    }
}
