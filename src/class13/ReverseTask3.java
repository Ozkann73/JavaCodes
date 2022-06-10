package class13;

public class ReverseTask3 {
    public static void main(String[] args) {
        String city = "Sirnak";
        for (int i=city.length()-1; i>=0; i--){
            System.out.print(city.charAt(i));
        }
    }
}
