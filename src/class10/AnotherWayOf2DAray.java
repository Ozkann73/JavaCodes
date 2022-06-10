package class10;

public class AnotherWayOf2DAray {
    public static void main(String[] args) {
        // create 2d array of states
        /*
        1 array -> NY all cities of NY state
        2 array -> CA all cities of CA state
        3 array -> FL all cities of FL state
        4 array -> VA all cities of VA state
         */
        String[][] usa = {
                {"NYC", "Albany", "Buffalo"},
                {"LA", "SFC", "San Jose", "San Diego", "Fremont"},
                {"Miami", "Orlando", "Tampa", "Niceville"},
                {"McLean", "Richmond", "Leesburg"}
        };
        System.out.println(usa[1][2]); // San Jose
        System.out.println(usa[2][0]); // Miami

        System.out.println(usa.length);

        // I want to see how many elemtns inside my 1st array
        int elements1 = usa[0].length;
        System.out.println(elements1);

        int elements2 = usa[1].length;
        System.out.println(elements2);

        int elements3 = usa[2].length;
        System.out.println(elements3);

    }
}
