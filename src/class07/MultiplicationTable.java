package class07;

public class MultiplicationTable {
    public static void main(String[] args) {
        // create multiplication table
        for (int x=1; x<=10; x++){
            for (int y=1; y<=10; y++){
                System.out.println(x+" "+y+" = "+(x*y));
            }
        }
    }
}
