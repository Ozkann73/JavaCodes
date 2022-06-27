package class11;

public class BiggestNumber {
    // Find the biggest number inside the array
    public static void main(String[] args) {
       int [] array ={ 10,30,45,51,36,92};

       int biggestNumber= array[0];
       int smallestNumber=array[0];
       for (int arr : array){
           if (arr>biggestNumber){
               biggestNumber=arr;
           }if (arr<smallestNumber){
               smallestNumber=arr;
           }
       }
        System.out.println("The smallest number is "+smallestNumber);
        System.out.println("The biggest number is "+biggestNumber);
    }
}
