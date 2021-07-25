package com.compare;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyMain {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(2, 10);
        Rectangle r2 = new Rectangle(3, 10);
        Rectangle r3 = new Rectangle(4, 10);

        List<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(r1);
        rectangles.add(r2);
        rectangles.add(r3);

        Comparable[] comparables = {r1, r2, r3};
        SortingAlgorithms.bubbleSort(comparables);
        System.out.println(Arrays.toString(comparables));


    }
}
