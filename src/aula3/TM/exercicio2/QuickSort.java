package com.meli;

import javax.swing.*;
import java.util.Comparator;

public class QuickSort<T> implements Sorter<T>{

    Comparator<T> comparator;

    @Override
    public void sort(T[] arr, Comparator<T> c) {
        this.comparator = c;
        quickSort(arr, 0, arr.length -1);
    }

    public void quickSort(T[] arr, int l, int h) {
        // Create an auxiliary stack
        int[] stack = new int[h - l + 1];

        // initialize top of stack
        int top = -1;

        // push initial values of l and h to stack
        stack[++top] = l;
        stack[++top] = h;

        // Keep popping from stack while is not empty
        while (top >= 0) {
            // Pop h and l
            h = stack[top--];
            l = stack[top--];

            // Set pivot element at its correct position
            // in sorted array
            int p = partition(arr, l, h);

            // If there are elements on left side of pivot,
            // then push left side to stack
            if (p - 1 > l) {
                stack[++top] = l;
                stack[++top] = p - 1;
            }

            // If there are elements on right side of pivot,
            // then push right side to stack
            if (p + 1 < h) {
                stack[++top] = p + 1;
                stack[++top] = h;
            }
        }
    }

    private int partition(T arr[], int low, int high)
    {
        T pivot = arr[high];

        // index of smaller element
        int i = (low - 1);
        for (int j = low; j <= high - 1; j++) {
            // If current element is smaller than or
            // equal to pivot
            if (this.comparator.compare(arr[j], pivot) > 0) {
                i++;

                // swap arr[i] and arr[j]
                T temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        T temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}
