package class30;

import java.util.LinkedHashMap;

public class Task1 {
    /*Create a map of a building. Store floor number and its associated company name.
    (Example: 1= Google, 2=Syntax etc.).
Insert 7 entries with duplicate keys and values.
- Check how many entries you have?
- Update company on a 4th floor
- Remove company on the 7th floor
- Print your map */
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> buildinMap = new LinkedHashMap<>();
        buildinMap.put(1,"Google");
        buildinMap.put(2,"Syntax");
        buildinMap.put(3,"Facebook");
        buildinMap.put(4,"Amazon");
        buildinMap.put(5,"Netflix");
        buildinMap.put(1,"Google");
        buildinMap.put(2,"Oracle");
        System.out.println(buildinMap.size());
        System.out.println(buildinMap);
        buildinMap.remove(5,"Youtube");
        System.out.println(buildinMap);
        buildinMap.remove(5);
        System.out.println(buildinMap);




    }
}
