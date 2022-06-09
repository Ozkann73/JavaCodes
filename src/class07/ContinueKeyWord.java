package class07;

public class ContinueKeyWord {
    public static void main (String[]args){
        // print numbers from 1 to 10 exept number 5 and 7
        for ( int i=1; i<=10; i++){
            if (i==5 || i == 7){
                continue;
            }
            System.out.print(i+" ");
        }
        System.out.println("                   ");
        // print number from 1 to 30 but skip the odd numbers
        for (int num=1; num<=30; num++){
            if(num%2!=0){
                continue;
            }
            System.out.print(num+" ");
        }
        System.out.println("                         ");
        for (int a=1; a<=50; a++){
            if(a%3==0){
                continue;
            }
            System.out.print(a+" ");
        }

    }
}
