package class12;

public class StringDemo6 {
    public static void main(String[] args) {
        String str = "1233454564512324122124211";

        int counter =0;
        for (int i=0; i<str.length();i++){
            if (str.charAt(i)=='1'){
                counter++;
            }
        }
        System.out.println("Number 1 has appeared "+counter+" times");
    }
}