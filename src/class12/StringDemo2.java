package class12;

public class StringDemo2 {
    public static void main(String[] args) {
        String firstName ="Adem";
        String lastName="Jones";
        String fullName= firstName+" "+lastName;
        System.out.println(fullName);

        String name="";
        System.out.println(name.isEmpty());

        String str= "           ne ver ";
        System.out.println(str.trim());  // removes only the spaces infront of the String and at the end of the string only
    }
}
