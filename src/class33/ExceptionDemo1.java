package class33;

public class ExceptionDemo1 {
     /*
        What is printStackTrace
        -- It is a method that show all the details of exception
         */

    public static void main(String[] args) {
        try {
            System.out.println(10/0);
        }catch (ArithmeticException ae){
            System.out.println("You are trying to divide an int value by zero");
            ae.printStackTrace();
            System.out.println(ae.getMessage());
            System.out.println(ae);
        }
        System.out.println("Important Code");
    }
}