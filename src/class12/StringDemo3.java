package class12;

import java.util.Locale;

public class StringDemo3 {
    public static void main(String[] args) {
        String str ="Batch 13 is Great";
        System.out.println(str.startsWith("Batch"));
        System.out.println(str.endsWith("Great"));
        System.out.println(str.endsWith("great"));

        String name ="HAMID";
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(str.toLowerCase().contains("Batch"));
    }
}
