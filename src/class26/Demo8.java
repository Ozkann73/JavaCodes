package class26;

import java.util.ArrayList;

public class Demo8 {
    public static void main(String[] args) {
        ArrayList<String> subjectsSeen=new ArrayList<>();
        subjectsSeen.add("SDLC");
        subjectsSeen.add("Manual Testing");
        subjectsSeen.add("Java");
        subjectsSeen.add("Git");
        subjectsSeen.add("Selenium");

        ArrayList<String> futureSubjects=new ArrayList<>();
        futureSubjects.add("TestNG");
        futureSubjects.add("Cucumber");
        futureSubjects.add("SQL");
        futureSubjects.add("API");
        futureSubjects.add("Jenkins");
        futureSubjects.add("AWS");
        futureSubjects.add("Docker");
        futureSubjects.add("APIUM");

        ArrayList<String> allSubjects=new ArrayList<>();
        allSubjects.addAll(subjectsSeen);
        allSubjects.addAll(1,futureSubjects);
        System.out.println("allSubjects = " + allSubjects);

        ArrayList<String>allsubjects2= new ArrayList<>();
        allsubjects2.addAll(subjectsSeen);
        allsubjects2.addAll(1,futureSubjects);
    }
}
