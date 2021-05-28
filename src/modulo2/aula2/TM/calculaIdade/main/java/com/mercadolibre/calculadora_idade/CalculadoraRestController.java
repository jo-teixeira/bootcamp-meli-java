package com.mercadolibre.calculadora_idade;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

@RestController
public class CalculadoraRestController {

    @GetMapping("/{day}/{month}/{year}")
    public String calcule(@PathVariable String day, @PathVariable String month, @PathVariable String year) {

        Calendar dateOfBirth = new GregorianCalendar();
        Date date = null;
        try{
            date = Date.from(LocalDate.parse(day + "/" + month + "/" + year, DateTimeFormatter.ofPattern("dd/MM/uuuu").withResolverStyle(ResolverStyle.STRICT)).atStartOfDay(ZoneId.systemDefault()).toInstant());

        }
        catch (Exception e){
            return "Data Invalida";
        }

        dateOfBirth.setTime(date);



        System.out.println(dateOfBirth.toString());

        Calendar today = Calendar.getInstance();

        int age = today.get(Calendar.YEAR) - dateOfBirth.get(Calendar.YEAR);


        dateOfBirth.add(Calendar.YEAR, age);

        if (today.before(dateOfBirth)) {
            age--;
        }

        return String.valueOf(age);

    }
}
