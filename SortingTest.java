import java.util.Arrays;
/**
 * Write a description of class SortingTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SortingTest
{
    public void printSortedArray(int[] array) {
        Arrays.sort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
    }
    
    public static void main(String[] args) {
        SortingTest sortingTest = new SortingTest();
        int[]numbers = {5, 3, 8, 1, 2, 7};
        sortingTest.printSortedArray(numbers);
    }
}
