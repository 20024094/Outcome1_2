package assessment12;

/**
 *
 * @author danie
 */


public class FindAverage {
    // Method to calculate and display file statistics: count, total memory, and average size
    public static void displayFileStatistics(int[] storageSpaces) {
        int totalFiles = storageSpaces.length; // The total number of files
        int totalMemory = 0; // Sum of all file sizes
        for (int size : storageSpaces) {
            totalMemory += size; // Accumulate total memory used
        }
        double averageSize = totalFiles > 0 ? (double) totalMemory / totalFiles : 0; // Calculate average size

        // Displaying the statistics
        System.out.println("Total number of files: " + totalFiles);
        System.out.println("Total memory used: " + totalMemory + " MB");
        System.out.printf("Average file size: %.2f MB\n", averageSize);
    }
}

