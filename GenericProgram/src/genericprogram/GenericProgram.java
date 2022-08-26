
package genericprogram;

import java.util.Arrays;

public class GenericProgram {

    public static void main(String[] args) {

        Float[] floats = { 1.1f, 4.8f, 6.5f, 11.6f, 13.3f, 12.5f };
        Integer[] ints = { 3, 6, 7, 4, 8, 3, 5 };

        System.out.printf("%n Unsorted Floats: %n ");

        aTypeOfArray(floats);

        Arrays.sort(floats, 0, 6);
        System.out.printf("%n%n Sorted Floats: %n");

        for (float aFloat : floats) {
            System.out.print(" " + aFloat);
        }

        System.out.printf("%n%n Unsorted Integers: %n");
        aTypeOfArray(ints);

        Arrays.sort(ints, 0, 7);
        System.out.printf("%n Sorted Integers: %n");

        for (int aInt : ints) {
            System.out.print(" " + aInt);
        }
    }

    public static <T> void aTypeOfArray(T[] array) {

        for (T element : array) {
            System.out.print(element + " ");
        }

        System.out.println();

    }
}








