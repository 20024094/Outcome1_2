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
 * Main class is responsible for starting the program and utilizing the SizeFinder and FindAverage
 * instantiated objects
 * functionalities to process storage spaces information.
 */
public class Main {
    // Globally available array of storage spaces in Megabytes (MB) representing file sizes
    static int[] storageSpaces = {232, 241, 324, 216, 221, 298, 334, 212, 235, 324, 264, 141};
    
    
    /**
     * main method which serves as the entry point for the program.
     * @param args Command line arguments (not used in this application).
     */
    public static void main(String[] args) {
        // Instantiate SizeFinder to use its methods for finding and displaying sizes.
        SizeFinder sizeFinder = new SizeFinder();
        // Display all file sizes using SizeFinder.
        sizeFinder.displayAllElements(storageSpaces);

        // Find and display the largest file size in the array.
        int largestSize = SizeFinder.findLargest(storageSpaces);
        System.out.println("The largest file size is: " + largestSize + " MB");
        
        // Instantiate FindAverage to calculate and display file statistics.
        FindAverage findAverage = new FindAverage();
        // Display file statistics such as count, total memory, and average size.
        findAverage.displayFileStatistics(storageSpaces);
    }
}
