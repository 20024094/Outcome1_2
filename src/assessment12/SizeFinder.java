package assessment12;

/**
 *
 * @author danie
 */

public class SizeFinder {
    // Method to find the largest element in the array
    public static int findLargest(int[] storageSpaces) {
        int largest = storageSpaces[0]; // Assume the first element is the largest initially
        for (int size : storageSpaces) {
            if (size > largest) {
                largest = size; // Update largest if current size is greater
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

