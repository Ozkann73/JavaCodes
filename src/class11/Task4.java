package class11;

public class Task4 {
    public static void main(String[] args) {
       /* Create a 2D array of intigers where you will store odd and even numbers
                Develop a program which will identify / print the even nums only*/

        int [][] array = {{5,8,4,10,7},{8,10,6,22,24},{40,35,67,71,60}};

        for (int i =0; i< array.length; i++){
            for (int j=0; j<array[i].length; j++){
                if (array[i][j]%2==0){
                    System.out.print(array[i][j]+" ");
                }
            }
        }
    }
}
