package class26;

import java.text.BreakIterator;
import java.util.ArrayList;

public class Demo7 {
    public static void main(String[] args) {
       ArrayList<String> subjects = new ArrayList<>();
       subjects.add("SDLC");
       subjects.add("Manual Testing");
       subjects.add("Java");
       subjects.add("Git");
       subjects.add("Selenium");
       subjects.add(1,"Jira");
        System.out.println(subjects.indexOf("Java"));
        System.out.println(subjects.size());
        System.out.println("subjects = " + subjects);
        System.out.println(subjects.contains("Selenium"));
        System.out.println(subjects.get(0));
        subjects.clear();
        System.out.println(subjects);




    }
}
