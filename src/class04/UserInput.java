package class04;



import java.util.Scanner;

public class UserInput {
    public static void main (String []args){
        String str = "Hello";

        //creating a scanner
        Scanner scan = new Scanner(System.in);

        // send instruction to the console
        System.out.println("Please enter your name");

        // we need to grab the values from console

        String name =scan.next();
        System.out.println(name);

        System.out.println("Please enter your age");
        int age = scan.nextInt();
        System.out.println(age);
    }
}
