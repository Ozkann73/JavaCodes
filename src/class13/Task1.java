package class13;

public class Task1 {
    public static void main(String[] args) {
        /*
        Create a String and if the String is not empty perform the followings;
        If the String has an odd number of characters and has 3 or more characters.
        print the character in the middle of the string
         */
        String name = "Ozkan";
        if (!name.isEmpty()){
            if (name.length()%2!=0 && name.length()>=3){
                int middle=name.length()/2;
                System.out.println(name.charAt(middle));;
            }
        }

    }
}
