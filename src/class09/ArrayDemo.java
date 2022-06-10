package class09;

public class ArrayDemo {
    public static void main(String[] args) {
        // create an array
        int[] b = new int[4];

        // store values
        b[0] = 90;
        b[1] = 85;
        b[2] = 70;
        b[3] = 100;

        // access values from the array
        System.out.println(b[2]);
        System.out.println(b[1] + b[3]);

        // we need to create an array of my classmates names
        String[] classMates = new String[5];
        classMates[0] = "Kristina";
        classMates[1] = "Ozkan";
        classMates[2] = "Mirhan";
        classMates[3] = "Ahmet";
        classMates[4] = "mehmet";
        //  classMates[5]="Elexia"; > with this its 6 elements, Out of bound error

        System.out.println(classMates[2]);
    }
}
