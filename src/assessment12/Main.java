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

public class Main {
    // Globally available array of storage spaces in Megabytes (MB)
    static int[] storageSpaces = {232, 241, 324, 216, 221, 298, 334, 212, 235, 324, 264, 141};

    public static void main(String[] args) {
        // Displaying all elements in the array
        SizeFinder.displayAllElements(storageSpaces);

        // Finding the largest file size and displaying it
        int largestSize = SizeFinder.findLargest(storageSpaces);
        System.out.println("The largest file size is: " + largestSize + " MB");
        
        // Utilizing FileAverage
        FindAverage.displayFileStatistics(storageSpaces);
    }
}
