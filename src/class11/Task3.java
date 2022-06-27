package class11;

public class Task3 {
    public static void main(String[] args) {
        /*Create a 2d array of integer values.
        Print the sum of all numbers*/

        int [][] array = {{2,2,2},{5,5,5},{3,3,3}};
        int sum=0;
        for (int i=0; i<3 ; i++){
            for (int j=0; j<3;j++){
                sum=sum+ array[i][j];
            }

        }
        System.out.println(sum);

        int [][] arr = {{10,20,30,40,50},
                {10,10,10,10},{5,5,5,5},{20,20,20,20}};
        System.out.println("==========================");
        int add= 0;
        for (int i=0; i<4; i++){
            for (int j=0; j<4; j++){
                add = add +arr[i][j];
            }
        }
        System.out.println("The addition of the numbers inside the array is "+add);

        System.out.println("=====================");

        int [][] tryAgain = {{10,20,30,40,50},{10,10,10,10,10},{5,5,5,5,5}};
        int total = 0;
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                total =total+ tryAgain[i][j];
            }
        }
        System.out.println(total);
    }
}
