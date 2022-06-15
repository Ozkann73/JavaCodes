package class17;

public class TeacherTester {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.name="Asghar";
        teacher.schoolName="Syntax";
        teacher.printInfo();
 // teacher.printInfo(); --> printInfo method is public thats why we can acces to the private fields too.
    }
}
