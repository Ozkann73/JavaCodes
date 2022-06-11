package class14;

public class StringBuilderDemo {
    public static void main(String[] args) {

        String s = new String("hahahha");
        System.out.println(s.toUpperCase());

        StringBuilder str = new StringBuilder("jajaja");
        System.out.println(str.reverse());

        /*
        String and StringBuilder both are classes that we can use to store and manipulate characters
        But String is immutable and StringBuilder is mutable
        When we make a lot of changes to a String it creates multiple copies inside your memory and
        bcs of this every change creATES a new variable. But StringBuilder no new variable is created
         */
    }
}
