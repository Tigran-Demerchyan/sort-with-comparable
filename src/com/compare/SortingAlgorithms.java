package com.compare;

import java.util.List;

public class SortingAlgorithms {

    public static void insertionSort(Comparable[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Comparable current = arr[i];
            int j = i;
            while (j > 0 && current.compareTo(arr[j - 1]) > 0) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = current;
        }
    }

    public static void insertionSort(List<Comparable> arr) {
        for (int i = 1; i < arr.size(); i++) {
            Comparable current = arr.get(i);
            int j = i;
            while (j > 0 && current.compareTo(arr.get(i - 1)) > 0) {
                arr.set(j, arr.get(j - 1));
                j--;
            }
            arr.set(j, current);
        }
    }

    public static void bubbleSort(Comparable[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    Comparable temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void bubbleSort(List<Comparable> arr) {
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size() - 1; j++) {
                if (arr.get(j).compareTo(arr.get(j + 1)) > 0) {
                    Comparable temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);

                }
            }
        }
    }

    private static void swap(Comparable[] arr, int i, int j) {
        Comparable temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static int partition(Comparable[] arr, int low, int high) {
        Comparable pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j <= high - 1; j++) {
            if (arr[j].compareTo(pivot) < 0) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }


    public static void quickSort(Comparable[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    public static void quickSort(Comparable[] arr, int start, int end) {
        if (start < end) {
            int pi = partition(arr, start, end);
            quickSort(arr, start, pi - 1);
            quickSort(arr, pi + 1, end);
        }
    }

}
