package ch16pc02;
import java.util.Scanner;

/**
 * Recursive Boolean method "isMember" demonstration
 * Search an array for a user-specified value
 * @author frank
 */
public class Ch16pc02 {

    /**
     * Main method to run the program
     * @param args String[] The command line arguments
     */
    public static void main(String[] args) {
        // Variables
        int[] array = new int[]{10, 15, 36, 98, 250, 76, 43, 600, 748, 25, -13};
        int value;
        boolean result;
        
        // Instantiate Scanner
        Scanner keyboard = new Scanner(System.in);
        
        // Request user input
        System.out.println("Welcome to the Recursive 'isMember' program.");
        System.out.print("Please enter the value (integer) you want to look for: ");
        value = keyboard.nextInt();
        
        // Call recursive method
        result = isMember(array, value);
        
        // Display results to user
        if (result) {
            System.out.println("The value " + Integer.toString(value) +
                    " is found in the array.");
        } else {
            System.out.println("The value " + Integer.toString(value) +
                    " is not found in the array.");
        }
        System.out.println("Thanks for playing.");
    }
    
    /**
     * Method to search an array for a value
     * @param array int The array to be searched
     * @param value int The value to search for
     * @return boolean True if value is in array; false otherwise
     */
    private static boolean isMember(int[] array, int value) {
        
        if (array.length == 0)
            return false;
        if (array[0] == value)
            return true;
        
        // Instantiate a new array and decrement its length
        int[] array2 = new int[array.length - 1];
        
        // Copy the first array -1 value into second array
        System.arraycopy(array, 1, array2, 0, array2.length);
        return isMember(array2, value);
    }
    
}
