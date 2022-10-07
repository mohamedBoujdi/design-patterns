package org.example;

import java.time.Instant;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class client {
    public static void main(String[] args) {
        //random array of 10 elements between 0 and 100 (inclusive)
        Integer[] arr = new Random().ints(10, 0, 101).boxed().toArray(Integer[]::new);
        System.out.println("Unsorted: " + Arrays.toString(arr));
        Context context = new Context();
        context.setSort(new BubbleSort());
        context.execute(arr);
        System.out.println("Sorted Bubble:"+ Date.from(Instant.ofEpochMilli(System.currentTimeMillis()))+":" + Arrays.toString(arr));
        //==================================================================================================
        Integer[] arr2 = new Random().ints(10, 0, 101).boxed().toArray(Integer[]::new);
        System.out.println("Unsorted: " + Arrays.toString(arr2));
        context.setSort(new HeapSort());
        context.execute(arr2);
        System.out.println("Sorted Heap:"+ Date.from(Instant.ofEpochMilli(System.currentTimeMillis()))+":" + Arrays.toString(arr2));
        //================================================================================================
         Integer[] arr3 = new Random().ints(10, 0, 101).boxed().toArray(Integer[]::new);
        System.out.println("Unsorted: " + Arrays.toString(arr3));
        context.setSort(new InsertionSort());
        context.execute(arr3);
        System.out.println("Sorted Insertion:"+ Date.from(Instant.ofEpochMilli(System.currentTimeMillis()))+":" + Arrays.toString(arr3));

}     }