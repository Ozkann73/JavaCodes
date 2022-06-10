package class10;

public class AllElementsFrom2DArray {
    public static void main(String[] args) {
        String[][] usa = {
                {"NYC", "Albany", "Buffalo"},
                {"LA", "SFC", "San Jose", "San Diego", "Fremont"},
                {"Miami", "Orlando", "Tampa", "Niceville"},
                {"McLean", "Richmond", "Leesburg"}
        };
        // outer loop iterates over rows
        // inner loops iterates over columns

        for (int row = 0; row < usa.length; row++) {
            for (int col = 0; col < usa[row].length; col++) {
                System.out.println(usa[row][col]);
            }

        }
    }
}
