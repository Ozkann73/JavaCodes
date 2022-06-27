package class11;

public class FindDuplicates {
    public static void main(String[] args) {
        // Find the duplicates inside the array
       int [] arr = {16,15,16,20,27,20 };

          for (int i=0; i<arr.length; i++){
              for (int j=i+1; j< arr.length; j++){
                  if(arr[i]==arr[j]&& i!=j){
                      System.out.println(arr[i]);
                  }
              }
          }
    }
}
