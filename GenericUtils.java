/**
 * A utility class that provides generic methods for arrays.
 * @author Maksym Kovacevic
 * @version 12-01-2025
 */
public class GenericUtils {
    /**
     * Reverses the elements of the given array in-place.
     * @param array The array to be reversed.
     * @param <T> The type of elements in the array.
     */
    public static <T> void reverse(T[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            T temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }
    /**
     * Calculates the sum of all elements in the given array.
     * The array should only contain elements of types that are subclasses of java.lang.Number.
     * @param array The array whose elements are to be summed.
     * @param <T> The type of elements in the array, which should be a subclass of Number.
     * @return The sum of all elements in the array as a double.
     */
    public static <T extends Number> double sum(T[] array) {
        double total = 0;
        for (T element : array) {
            total += element.doubleValue();
        }
        return total;
    }
}