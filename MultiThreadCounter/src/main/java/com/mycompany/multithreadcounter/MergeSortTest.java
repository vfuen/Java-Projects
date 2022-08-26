/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.multithreadcounter;

import java.util.Arrays;
import java.util.Collections;

public class MergeSortTest {

    public static void main(String args[]) {

        // initialize Integer array

        Integer[] intArray = {63, 19, 65, 38, 26, 74, 27, 25, 70, 38};

        // display intArray in original order

        System.out.println("Integer data items in original order");

        displayArray(intArray); // display array elements

        selectionSort(intArray); // sort the array

        // display intArray in sorted order

        System.out.println("\nInteger data items in ascending order");

        displayArray(intArray); // display array elements

        System.out.println("\n");

        // initialize Double array

        Double[] doubleArray = {102.5, 1.98, -3.12, 45.23, 4.5, -56.78, 38.24, 12.34, -105.23, 77.39};

        // display doubleArray in original order

        System.out.println("Double data items in original order");

        displayArray(doubleArray); 

        selectionSort(doubleArray); 


        System.out.println("\nDouble data items in ascending order");

        displayArray(doubleArray);
     String[] stringArray = {"zebra", "wolf", "panda", "octopus", "monkey", "fox", "elephant", "dog", "cat", "allegator"};
    Collections.sort(stringArray); 
            

    
    
    }

    // generic method that sorts elements in array

    public static <T extends Comparable<T>> void selectionSort(T[] array) {

        int smallest; 


        for (int spot = 0; spot < array.length - 1; spot++) {

            smallest = spot;


            for (int element = spot + 1; element < array.length; element++) {

                if (array[element].compareTo(array[smallest]) < 0) {

                    smallest = element;

                }

            }


            swap(array, smallest, spot);

        }

    }


    public static <T> void swap(T[] array, int first, int second) {

        T temp = array[first]; // copy first to temp

        array[first] = array[second]; // copy second to first

        array[second] = temp; // copy temp to second

    }

    // generic method that displays array element

    public static <T> void displayArray(T[] array) {

        // display each element

        for (T element : array) {

            System.out.printf("%s ", element);

        }

        System.out.println();

    }

}
