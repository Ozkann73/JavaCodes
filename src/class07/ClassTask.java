package class07;

public class ClassTask {
    public static void main(String[] args) {
        // print even numbers from 1 to 20
        int e = 2;
        while (e <= 20) {
            System.out.print(e + " ");
            e += 2;
        }
        System.out.println("=========================");

        int num = 1;
        while (num <= 20) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
            num++;
        }
        System.out.println("=====================");
        // print odd numbers from 20 to 1
        int a = 20;
        while (a >= 1) {
            if (a % 2 == 1) {
                System.out.print(a + " ");
            }
            a--;
        }
    }
}
