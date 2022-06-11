package class15;

public class VariablesDemo2 {
    int num=10;// whenever we have to share some info in more than one methods
                // of a class we use instance variables

    void method1(){
        int num2=30;
        System.out.println(num);
    }
    void method2(){
      //  System.out.println(num2);  we cant use local variables inside other methods
        System.out.println(num);
    }
}
