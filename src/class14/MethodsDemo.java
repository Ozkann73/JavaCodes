package class14;

import java.util.Scanner;

public class MethodsDemo {
    /*
   What is a Method :  Method is a block of code, a group of java statement that are grouped together
    and we can execute those statements by just creating an object of the class that contains
   How :  that method and by writing the objects name .method name

     */

    void printHello (){
        System.out.println("How are you guys");
    }
    boolean returnTrue (){
        return true;
    }
    int returnInt(){
        return 10;
    }

    //Two types of methods. 1 is Methods that return something 2 is methods that don't return anything

    public static void main(String[] args) {
        MethodsDemo md = new MethodsDemo();
        md.printHello();

        boolean xs=md.returnTrue();
        int num = md.returnInt();
        System.out.println(num);
        System.out.println(xs);
        // Scanner scan = new Scanner(System.in);
        //scan.nextInt();


    }
}
