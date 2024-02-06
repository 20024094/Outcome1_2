package assessment12;

/**
 *
 * @author danie
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
        
        // Utilizing FileStatistics
        FindAverage.displayFileStatistics(storageSpaces);
    }
}
