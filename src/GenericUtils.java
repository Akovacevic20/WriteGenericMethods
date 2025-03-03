import java.util.Arrays;
/**
 * A utility class that provides generic methods for array manipulation.
 *
 * @author Adrian Kovacevic
 * @version 01-03-25
 */
public class GenericUtils {
    // to reverse an array in place
    /**
     * Reverses a given array in place.
     *
     * @param <T>   The type of elements in the array.
     * @param array The array to be reversed.
     */
    public static <T> void reverse(T[] array) {
        int left = 0, right = array.length - 1;
        while (left < right) {
            T temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    // Method to sum an array of Numbers and return the result as double
    /**
     * Calculates the sum of elements in a numeric array.
     *
     * @param <T>   The type of numbers in array, must extend Number java.lang.Number-class
     * @param array The array whose elements will be summed.
     * @return The sum of all elements in array as double.
     * using a for loop
     */
    public static <T extends Number> double sum(T[] array) {
        //must be able to be turned into numeric  value
        double total = 0.0;
        for (int i = 0; i < array.length; i++) {
            total += array[i].doubleValue();
            //converts numberic array in double and so on
        }
        return total;
    }
}