package aula1.TM;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ExerciseExtraB {

    private static Double companyValueA = 1.13;
    private static Double companyValueB = 18.4;
    private static final Double companyPercentA = 2.48;
    private static final Double companyPercentB = 1.32;

    public static void main(String[] args) {
        processCompanysAlongTime();
    }

    private static void processCompanysAlongTime(){
        int year = 2021;
        while(companyValueA < companyValueB){
            year++;
            companyValueA *= companyPercentA;
            companyValueB *= companyPercentB;
            System.out.println("Year " + year + ": " + companyValueA + " x "
                               + companyValueB + " (Company A x Company B)");
        }
    }
}
