package class26;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {
        String name= "Aladin";
        String name2 ="Riza";
        String name3 = "Ahmed";


        String [] names = {"Aladin", "Riza","Ahmed"};
        System.out.println(names.length);
        ArrayList<String> syntaxStudents = new ArrayList<>();
        System.out.println(syntaxStudents.size());
        syntaxStudents.add("Riaz");
        System.out.println(syntaxStudents.size());
        syntaxStudents.add("karla");
        syntaxStudents.add("ivan");
        System.out.println(syntaxStudents.size());

        ArrayList<Integer>numbers=new ArrayList<>();
        for (int i=1; i<10; i=i+2){
            numbers.add(i);
        }
        System.out.println(numbers);
    }
}
