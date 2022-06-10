package class10;

public class Task {
    public static void main(String[] args) {
        // from an array of int elements find the largest number
        int[] array = {5, 35, 45, 3, 234, 45, 645, 453};
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("The largest element is " + max);
    }
}
