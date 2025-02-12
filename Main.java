/**
 * A test class to demonstrate the functionality of the GenericUtils class.
 * @author Maksym Kovacevic
 * @version 12-01-2025
 */
public class Main {
    public static void main(String[] args){
        // Test the reverse method
        Integer[] numberArray = {1, 2, 3, 4, 5};
        System.out.println("Original number array: ");
        printArray(numberArray);
        GenericUtils.reverse(numberArray);
        System.out.println("Reversed number array: ");
        printArray(numberArray);
        String[] stringArray = {"Hello", "World", "Java", "Generics"};
        System.out.println("Original string array: ");
        printArray(stringArray);
        GenericUtils.reverse(stringArray);
        System.out.println("Reversed string array: ");
        printArray(stringArray);

        // Test the sum method
        Integer[] intArray = {1, 2, 3, 4, 5};
        printArray(intArray);
        System.out.println("Sum of integer array: " + GenericUtils.sum(intArray));
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        printArray(doubleArray);
        System.out.println("Sum of double array: " + GenericUtils.sum(doubleArray));
    }

    /**
     * A helper method to print the elements of an array.
     * @param array The array whose elements are to be printed.
     * @param <T> The type of elements in the array.
     */
    private static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
