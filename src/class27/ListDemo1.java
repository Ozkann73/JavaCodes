package class27;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args) {
        List<String> legends= new ArrayList<>();
        legends.add("Hamid");
        legends.add("Karla");
        legends.add("Naveed");
        legends.add("Tara");
        System.out.println(legends.size());
        System.out.println(legends.isEmpty());
        System.out.println(legends.contains("Bahram"));
        System.out.println(legends.contains("Hamid"));
        Object [] arr = legends.toArray();
        System.out.println(arr[0]);
        System.out.println(legends);
      //  legends.remove("Hamid");
        System.out.println(legends);

        List<String>someStudents = new ArrayList<>();
        someStudents.add("Hamid");
        someStudents.add("Naveed");
        System.out.println(legends.containsAll(someStudents));
    }

}
