package class13;

public class StringDemo2 {
    public static void main(String[] args) {
        String str = "asdasfsdfDGDFHDSGHGFh123124324@#%#$^@#$@#%";
        System.out.println(str.replaceAll("[a-z]","*"));
        System.out.println(str.replaceAll("[A-Z]","!"));
        System.out.println(str.replaceAll("[^a-z]","_"));
        System.out.println(str.replaceAll("[^0-9a-z]","*"));

        System.out.println(str.replaceAll("[^A-Za-z0-9]",""));
    }
}
