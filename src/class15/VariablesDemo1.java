package class15;

public class VariablesDemo1 {
    String breed; // instance variable

    static int num =5; // static variable

   static void printName(){
        String name="local"; // local variable
        System.out.println(name);
    }

    public static void main(String[] args) {
        VariablesDemo1 v= new VariablesDemo1();
        v.printName();
        System.out.println(VariablesDemo1.num); // we can call static variable like this
        VariablesDemo1.printName();
   }
}
