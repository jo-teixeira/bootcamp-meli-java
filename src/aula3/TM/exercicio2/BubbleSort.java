package com.meli;

import java.util.Comparator;

public class BubbleSort<T> implements Sorter<T> {

    Comparator<T> comparator;

    @Override
    public void sort(T[] arr, Comparator<T> c) {
        this.comparator = c;
        bubbleSort(arr);
    }

    public void bubbleSort(T[] arr) {

        int n = arr.length;
        boolean keepSorting;
        for (int i = 0; i < n-1; i++) {

            keepSorting = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (comparator.compare(arr[j], arr[j + 1]) < 0) {
                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    keepSorting = true;
                }
            }
            if (!keepSorting) break;
        }
    }


}
