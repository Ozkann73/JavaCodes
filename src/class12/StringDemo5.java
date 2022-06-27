package class12;

public class StringDemo5 {
    public static void main(String[] args) {
        String str = "Sameer is funny";
       /* System.out.println(str.charAt(2));
        System.out.println(str.charAt(5));*/

       /* for (int i=0; i<str.length();i++){
            System.out.println(str.charAt(i));
        }*/
        int counter=0;
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i)=='s'|| str.charAt(i)=='S'){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
