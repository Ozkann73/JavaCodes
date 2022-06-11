package class14;

import java.util.Scanner;

public class MethodDemo3 {
    /*
     Write a method that takes an int value if that value is even,
     this method returns true otherwise it returns false
     */
    boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }


    // write a method that takes a String and returns true if number of characters in that String
    // are even otherwise odd
    boolean even(String str) {
        if (str.length() % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        MethodDemo3 md3 = new MethodDemo3();

        System.out.println(md3.isEven(5));
        System.out.println(md3.even("Senobalim"));


    }


}
