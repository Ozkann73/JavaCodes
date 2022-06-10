package class10;

public class ArrayTask {
    public static void main(String[] args) {
        // create an array of int and calculate the sum of all elements in array
        int[] numbers = {10, 22, 45, 456, 34};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];

        }
        System.out.println("Sum of all elements is = " + sum);
        sum = 0;
        for (int num : numbers) {
            sum += num;

        }
        System.out.println(sum);

    }
}
