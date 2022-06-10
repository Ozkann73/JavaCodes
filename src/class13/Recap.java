package class13;

public class Recap {
    public static void main(String[] args) {
        String str = "Batch 13 is great but i say this to every batch. I was kidding";
        System.out.println(str.length());
        int len = str.length();
        System.out.println(str.toUpperCase());
        System.out.println(str);
        str = str.toUpperCase();
        System.out.println(str);
        System.out.println(str.isEmpty());

        String str2 = "   Tara   ";
        System.out.println(str2.trim());
        System.out.println(str.contains("SAY"));
        System.out.println(str.contains("z"));
        System.out.println(str.startsWith("BATCH"));
        System.out.println(str.endsWith("kidding"));
    }
}
