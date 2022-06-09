package class07;

public class NestedLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {  // outer loop controls inner loop
            System.out.println("Hello");
            for (int y = 1; y <= 2; y++) {
                System.out.println("bye");
            }
        }
        System.out.println("                                 ");
        for (int i = 1; i <= 3; i++) {  // outer loop controls inner loop

            for (int y = 1; y <= 2; y++) {
                System.out.print(i + " " + y);
            }
        }
    }
}
