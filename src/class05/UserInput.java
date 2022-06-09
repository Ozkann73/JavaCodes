package class05;

import java.util.Scanner;

public class UserInput {
    public static void main (String []args){
        Scanner input = new Scanner(System.in);

      System.out.println("Please enter your name");
        String name = input.next();
        System.out.println(name);

        System.out.println("Please enter your age");
        int age = input.nextInt();
        System.out.println(age);

        System.out.println("Please enter the price you bought your phone");
        double price = input.nextDouble();
        System.out.println(price);

        System.out.println("Please ente boolean");
        boolean boo = input.nextBoolean();
        System.out.println(boo);

        System.out.println("Please enter any character");
        char character = input.next().charAt(2);
        System.out.println(character);

        System.out.println("Please enter your full name");
        String fullName = input.nextLine();
        System.out.println(fullName);

    }
}
