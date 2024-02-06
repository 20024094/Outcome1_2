package assessment12;

/**
 * Module: Software Development: Programming Foundations
 * Student: Daniel Barbu: 20024094
 * Application: Assessment1_2
 * Version: 1.0
 * Date: 6/02/2024
 * Files: Main.java, SizeFinder.java, FindAverage.java
 *
 * @author Daniel Barbu
 */

public class SizeFinder {
    // Method to find the largest element in the array
    public static int findLargest(int[] storageSpaces) {
        // Assume the first element is the largest initially
        int largest = storageSpaces[0]; 
        for (int size : storageSpaces) {
            if (size > largest) {
                // Update largest if current size is greater
                largest = size; 
            }
        }
        return largest;
    }

    // Method to display all elements in the array
    public static void displayAllElements(int[] storageSpaces) {
        System.out.println("Displaying all file sizes:");
        for (int size : storageSpaces) {
            System.out.println(size + " MB");
        }
    }
}

