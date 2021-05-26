package modulo2.aula1.services;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Map;

import static java.util.Map.entry;

@Service
public class MorseService {

    private Map<String, String> morseMap = Map.ofEntries(

            entry(".-", "A"),
            entry("-...", "B"),
            entry("-.-.", "C"),
            entry("-..", "D"),
            entry(".", "E"),
            entry("..-.", "F"),
            entry("--.", "G"),
            entry("....", "H"),
            entry("..", "I"),
            entry(".---", "J"),
            entry("-.-", "K"),
            entry(".-..", "L"),
            entry("--", "M"),
            entry("-.", "N"),
            entry("---", "O"),
            entry(".--.", "P"),
            entry("--.-", "Q"),
            entry(".-.", "R"),
            entry("...", "S"),
            entry("-", "T"),
            entry("..-", "U"),
            entry("...-", "V"),
            entry(".--", "W"),
            entry("-..-", "X"),
            entry("-.--", "Y"),
            entry("--..", "Z"),
            entry("", " ")
    );

    public String translateMorse(String morse) {

        return Arrays.stream(morse.split("\\s")).map(elem -> morseMap.get(elem)).reduce("", (cumulative, elem) -> cumulative + elem);

    }
}


