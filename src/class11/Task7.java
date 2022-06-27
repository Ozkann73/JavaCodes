package class11;

public class Task7 {
    public static void main(String[] args) {
        // Maximum and minimum number in the array

        int [] arr = {10,20,50,8,5};

        int maxNumber = arr[0];
        int minNumber= arr [0];
        for (int num : arr){
            if (num>maxNumber){
                maxNumber=num;
            }if (num<minNumber){
                minNumber=num;
            }
        }
        System.out.println(minNumber);
        System.out.println(maxNumber);
    }
}
