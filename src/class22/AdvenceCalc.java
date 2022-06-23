package class22;

public class AdvenceCalc {
    /*void sum(int num1, int num2){
        System.out.println(num1+num2);
    }
    void sum(int num1, int num2, int num3){
        System.out.println(num1+num2+num3);
    }
    void sum(int num1, int num2, int num3, int num4){
        System.out.println(num1+num2+num3+num4);
    }*/
   static void sum(int... arr){
      // System.out.println("1");
       int sum=0;
       for (int i=0; i< arr.length; i++){
          sum=sum+arr[i];
       }
       System.out.println(sum);
    }
   static void printName(String...names){
       for (String name: names){
           System.out.println(name);
       }
    }

    public static void main(String[] args) {
        sum(2,2,3,4,5,9,8,7);
        printName("Aladin","Aladin","Aladin");

        int age=10;
       /* String name;
        if (age>18){
            name="Time to go work";
        }else {
            name="Enjoy no Work";
        }
        System.out.println(name);*/

        // Ternary operator
        String name2=age>18?"Time to go work":"Enjoy no Work";
        String name3=age>18?age>10?"nested in":"Time to go work":"Enjoy no Work";
        System.out.println(name2);
    }
}
