package class4.list2.ex6;

public class StringUtil {

    public static String rpad(String s, char c, int n) {
        for (int i = 0; i < n; i++) {
            s += c;
        }
        return s;
    }

    public static String ltrim(String s) {
        String resultado = "";
        boolean fimDeWhitespace = false;
        for (char ch : s.toCharArray()) {
            if (!Character.isWhitespace(ch)) {
                fimDeWhitespace = true;
            }
            if (fimDeWhitespace) {
                resultado += ch;
            }

        }
        return resultado;
    }

    public static String rtrim(String s) {
        String resultado = "";
        boolean fimDeWhitespace = false;
        char[] charArray = s.toCharArray();
        for (int i = s.length() - 1; i > -1; i--) {
            if (!Character.isWhitespace(charArray[i])) {
                fimDeWhitespace = true;
            }
            if (fimDeWhitespace) {
                resultado += charArray[i];
            }

        }
        resultado = new StringBuilder(resultado).reverse().toString();
        return resultado;
    }

    public static String trim(String s) {
        s = ltrim(s);
        return rtrim(s);
    }

    public static int indexOfN (String s, char c, int n){

        int contador = 0;
        char[] charArray = s.toCharArray();
        for (int i = 0; i < s.length(); i++){
            if (charArray[i] == c){
                contador +=1;
                if (contador == n){
                    return i;
                }
            }
        }
        return -1;

    }


}
