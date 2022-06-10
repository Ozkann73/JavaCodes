package class09;

public class StringArray {
    public static void main(String[] args) {
        String [] fruits = {"mango","banana","blueberry","orange"};
        System.out.println(fruits[2]);
        fruits[2]="Peach";
        System.out.println(fruits[2]);

        System.out.println(fruits.length);


        // We use for each loop / emhanced for loop only in arrays
        String [] colors ={"pink","blue","red","green"};
        for (String color:colors){
            System.out.print(color+" ");
        }
        System.out.println("                             ");
        int[]nums = {1,2,3,4};
        for (int num :nums){
            System.out.print(num+" ");
        }
    }
}
