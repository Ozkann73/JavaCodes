package class16;

public class StaticDemo {
   static int noOfEmployees;
    String name;

    static void method1 (){
        System.out.println(noOfEmployees);
      //  System.out.println(name); We cant put non static variable indide static method
    }
    void method2 (){
        System.out.println(name);
    }

    public static void main(String[] args) {
        StaticDemo st = new StaticDemo();
        st.name="Ozkan";

        StaticDemo st2 = new StaticDemo();
        st2.name="Mirhan";
    }
}
