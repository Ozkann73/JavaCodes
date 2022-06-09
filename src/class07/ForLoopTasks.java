package class07;

public class ForLoopTasks {
    public static void main (String []args){
        // print even numbers from 20 to 1
        for (int i=20; i>=1; i--){
            if (i%2==0){
                System.out.print(i+" ");
            }

        }
        System.out.println("----------------------");
        // print odd numbers from 1 to 25
        for (int b=1; b<=25; b++){
            if (b%2!=0){
                System.out.print(b+" ");
            }
        }
    }
}
