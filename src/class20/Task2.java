package class20;

public class Task2 {
    /*
    Write program to inherit class A that has method printF which is static
     and call or reuse that method into class B
     */
    public static void main(String[] args) {
        B.printF();
    }
}
class A {
    public static void printF(){
        System.out.println("Method printF in class A");
    }
}
class B extends  A{

}
