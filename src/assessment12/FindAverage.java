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
 * FindAverage class provides a method to calculate and display statistics about file sizes,
 * such as the total number of files, the total memory used, and the average file size.
 */
public class FindAverage {
    
    /**
     * Calculates and displays file statistics for the given array of storage spaces.
     * @param storageSpaces Array of file sizes to calculate statistics from.
     */
    public static void displayFileStatistics(int[] storageSpaces) {
        int totalFiles = storageSpaces.length; // The total number of files.
        int totalMemory = 0; // Initialize total memory used to 0.
        
        // Iterate through each file size to accumulate the total memory used.
        for (int size : storageSpaces) {
            // accumulate total memory used
            totalMemory += size; // Add size of each file to totalMemory.
        }
        // Calculate average file size. Avoid division by zero by checking if totalFiles is greater than 0.
        double averageSize = totalFiles > 0 ? (double) totalMemory / totalFiles : 0; 

        // Displaying the statistics
        System.out.println("Total number of files: " + totalFiles);
        System.out.println("Total memory used: " + totalMemory + " MB");
        System.out.printf("Average file size: %.2f MB\n", averageSize); // Format average to 2 decimal places.
    }
}

