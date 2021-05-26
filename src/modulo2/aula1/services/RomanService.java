package modulo2.aula1.services;

import org.springframework.stereotype.Service;

@Service
public class RomanService {

    private int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private String[] romanLiterals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};


    public String romanToNumber(int number) {
        StringBuilder roman = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (number >= values[i]) {
                number -= values[i];
                roman.append(romanLiterals[i]);
            }
        }
        return roman.toString();
    }
}
