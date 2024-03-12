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
        // creating an instance of SizeFinder
        SizeFinder sizeFinder = new SizeFinder();
        // Displaying all elements in the array
        sizeFinder.displayAllElements(storageSpaces);

        // Finding the largest file size and displaying it
        int largestSize = SizeFinder.findLargest(storageSpaces);
        System.out.println("The largest file size is: " + largestSize + " MB");
        
        // creating an instance of FindAverage
        FindAverage findAverage = new FindAverage();
        // Utilizing FileAverage
        findAverage.displayFileStatistics(storageSpaces);
    }
}
