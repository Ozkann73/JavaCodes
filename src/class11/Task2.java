package class11;

import java.util.Scanner;

public class Task2 {
   /* Using Scanner create an array of countries.
        When an array is created, retrieve all values from it
    and while retrieving those values print the capital for each country*/
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Please enter the size of the array");
       int arraySize = scanner.nextInt();
       String [] countryArray = new String[arraySize];

       for (int i =0; i<countryArray.length;i++){
           countryArray[i]=scanner.next();
       }
       for (String element : countryArray){
           if (element.equalsIgnoreCase("USA")){
               System.out.println("Washington DC");
           }else if (element.equalsIgnoreCase("turkey")){
               System.out.println("ankara");
           }else if (element.equalsIgnoreCase("thailand")){
               System.out.println("bangkok");
           }else{
               System.out.println("Country not supported");
           }
       }
   }


}
