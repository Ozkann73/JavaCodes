package class13;

public class Task3 {
    public static void main(String[] args) {
        /*
        Write aprogram that reads two peoples first name and if they expecting boy or girl based
        on input suggest a name for the baby
         */
        String father ="Ahmet";
        String mother = "Fatma";
        boolean boy = false; // if true boy otherwise girl

        if (boy){
            String firstHalf= father.substring(0,father.length()/2);
            String secondHalf = mother.substring(0,mother.length()/2);
            System.out.print(firstHalf+secondHalf);
        }else {
            String secondHalf = mother.substring(0,mother.length()/2);
            String firstHalf= father.substring(0,father.length()/2);
            System.out.println(secondHalf+firstHalf);
        }String firstHalf= father.substring(0,father.length()/2);
    }
}
