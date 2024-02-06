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


public class FindAverage {
    // Method to calculate and display file statistics: count, total memory, and average size
    public static void displayFileStatistics(int[] storageSpaces) {
        // total number of files
        int totalFiles = storageSpaces.length;
        // sum of all file sizes
        int totalMemory = 0; 
        for (int size : storageSpaces) {
            // accumulate total memory used
            totalMemory += size; 
        }
        // Calculate average size
        double averageSize = totalFiles > 0 ? (double) totalMemory / totalFiles : 0; 

        // Displaying the statistics
        System.out.println("Total number of files: " + totalFiles);
        System.out.println("Total memory used: " + totalMemory + " MB");
        System.out.printf("Average file size: %.2f MB\n", averageSize);
    }
}

