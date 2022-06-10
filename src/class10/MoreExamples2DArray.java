package class10;

public class MoreExamples2DArray {
    public static void main(String[] args) {
        int[][] nums = {{1, 2, 3, 4, 5}, {24, 235, 434, 234, 45}, {34, 23, 2, 34, 5, 63}};
        System.out.println("All values using enhanced for loop");

        /*enhanced for loop uses variables to access elements from an array
         * outer for loops -> iterates over 1D array
         * inner loop -> iterates over elements of each 1D array
         * */

        for (int[] num : nums) {
            for (int n : num) {
                System.out.println(n);
            }
        }
    }
}
