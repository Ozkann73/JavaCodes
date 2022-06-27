package class11;

public class Task2Tester {
    public static void main(String[] args) {
        int [] [] array = {{5,5,5,5},{10,10,10,10},{5,8,9,10}};

        int sum=0;
        for (int i=0; i<array.length; i++){
            for (int j=0; j<array[i].length; j++){
                sum = sum+ array[i][j];
            }
        }
        System.out.println("The sum of the elements in array is "+sum);

        int [][] arr = {{5,70,80,62,10,30,50},{50,10,40,10,20},{20,10,40,30,20,20}};
        int sum1 =0;
        for (int i =0; i<arr.length;i++){
            for (int j=0; j<arr[i].length; j++){
                sum1 = sum1 + arr[i][j];
            }
        }
        System.out.println(sum1);

        int [] ar = {10,20,30,10};

        int num=0;
        for (int i=0; i<ar.length;i++){
            num = num+ ar[i];
        }
        System.out.println(num);
    }
}
