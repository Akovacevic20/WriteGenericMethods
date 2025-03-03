import java.util.Arrays;
import java.lang.Number; //java.lang is automatically imported,
/**
 * A class to test the methods of GenericUtils.
 *
 * @author Adrian Kovacevic
 * @version 01-03-25
 */
class Main {
    /**
     * The main method to test reverse and sum methods.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        // Test reverse method
        Integer[] intArray = {1, 2, 3, 4, 5}; //Creates an Integer array {1, 2, 3, 4, 5}.
        //Prints the original array using Arrays.toString().
        System.out.println("Original Integer Array: " + Arrays.toString(intArray));
        GenericUtils.reverse(intArray); //reverses the array in place.
        //Prints the reversed array to check
        System.out.println("Reversed Integer Array: " + Arrays.toString(intArray));

        //same but with string
        String[] strArray = {"A", "B", "C", "D"};
        System.out.println("Original String Array: " + Arrays.toString(strArray));
        GenericUtils.reverse(strArray);
        System.out.println("Reversed String Array: " + Arrays.toString(strArray));

        // Test sum method
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        System.out.println("Sum of Double Array: " + GenericUtils.sum(doubleArray));

        Integer[] intArrayForSum = {10, 20, 30, 40};
        System.out.println("Sum of Integer Array: " + GenericUtils.sum(intArrayForSum));
    }
}
