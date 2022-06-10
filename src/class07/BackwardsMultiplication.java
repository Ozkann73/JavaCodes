package class07;

public class BackwardsMultiplication {
    public static void main(String[] args) {
        int a = 5;
        for (int i = 10; i >= 1; i--) {
            System.out.println(a + " * " + i + " = " + (a * i));
        }
    }
}
