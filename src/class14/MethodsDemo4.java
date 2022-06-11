package class14;

public class MethodsDemo4 {
    int sumNumbers(int num1, int num2) {
        return num1 + num2;
    }

    //write a method that takes a String and an Int and printsout that String on the console
    //that many times that value that we can in int
    void print(String name, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        MethodsDemo4 md = new MethodsDemo4();
        System.out.println(md.sumNumbers(12, 23));
        md.print("Mirhan", 3);
    }
}
