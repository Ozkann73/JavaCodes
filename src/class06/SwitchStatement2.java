package class06;

public class SwitchStatement2 {
    public static void main(String[] args) {
        char choice = 'X';
        String meaning;
        switch (choice) {
            case 'Y':
                meaning = "Yes";
                break;
            case 'M':
                meaning = " Maybe";
                break;
            case 'N':
                meaning = "No";
                break;
            default:
                meaning = "Unknown";

        }
        System.out.println(meaning);
    }
}
