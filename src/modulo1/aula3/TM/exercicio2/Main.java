package com.meli;

import java.lang.reflect.InvocationTargetException;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Integer[] arr = new Integer[100000];
        for (int i = 99999; i >= 0; i--)
            arr[99999 - i] = i;

        Comparator<Integer> c = (i1, i2) -> i2 - i1;


        Sorter sorter = SorterFactory.getInstance("sorter");

        Timer timer = new Timer();
        timer.start();

        sorter.sort(arr, c);

        timer.stop();

        for (Integer i: arr) {
            System.out.println(i);
        }

        System.out.println("Tardó "+ timer.getElapsedTime() + " ms.");
    }
}
