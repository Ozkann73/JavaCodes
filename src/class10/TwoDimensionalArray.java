package class10;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        // to create 2D array we specify number of rows and columns = size
        int[][] numbers = new int[3][4];

        // first row
        numbers[0][0] = 10;
        numbers[0][1] = 20;
        numbers[0][2] = 30;
        numbers[0][3] = 40;

        // second row
        numbers[1][0] = 1;
        numbers[1][1] = 2;
        numbers[1][2] = 3;
        numbers[1][3] = 4;

        //third row
        numbers[2][0] = 9;
        numbers[2][1] = 8;
        numbers[2][2] = 7;
        numbers[2][3] = 6;

        System.out.println(numbers[1][3]);
        System.out.println(numbers[0][1]);

        int rows = numbers.length; // gives numbers of 1 d arrays
        System.out.println("Number of rows = " + rows);

        int colsOf1row = numbers[0].length;
        System.out.println("Number of cols in 1 row =" + colsOf1row);

    }
}
