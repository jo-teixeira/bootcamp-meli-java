package modulo2.aula1.controllers;

import modulo2.aula1.models.Response;
import modulo2.aula1.services.MorseService;
import modulo2.aula1.services.RomanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    private MorseService morseService;

    @Autowired
    private RomanService romanService;

    @GetMapping(value = "/morse")
    public ResponseEntity<Response> morse(@RequestParam String code) {
        return ResponseEntity.ok(new Response(morseService.translateMorse(code)));
    }

    @GetMapping(value = "/roman")
    public ResponseEntity<Response> roman(@RequestParam Integer number) {
        return ResponseEntity.ok(new Response(romanService.romanToNumber(number).toString()));
    }
}