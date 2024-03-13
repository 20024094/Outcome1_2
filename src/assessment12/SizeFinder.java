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


/**
 * The SizeFinder class provides methods to find the largest file size and display all file sizes.
 */
public class SizeFinder {
    /**
     * Finds the largest file size within an array of storage spaces.
     * @param storageSpaces Array of file sizes.
     * @return The largest file size found in the array.
     */
    public static int findLargest(int[] storageSpaces) {
        // Assume the first element is the largest initially
        int largest = storageSpaces[0]; // Start by assuming the first element is the largest.
        for (int size : storageSpaces) {
            if (size > largest) {
                largest = size; // Update largest if current size is greater.
            }
        }
        return largest;
    }

    /**
     * Displays all file sizes in the storage spaces array.
     * @param storageSpaces Array of file sizes to be displayed.
     */
    public static void displayAllElements(int[] storageSpaces) {
        System.out.println("Displaying all file sizes:");
        for (int size : storageSpaces) {
            System.out.println(size + " MB");
        }
    }
}

