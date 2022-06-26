package class24;

public class StudentTester {
    public static void main(String[] args) {
        Student [] array = {new SyntaxStudent(),new ClollegeStudent(),new SchooldStudent()};
        for (Student ar :array){
            ar.study();
            ar.practice();
            ar.doHomeWork();
        }
        System.out.println("==================================");
        for (int i=0; i<array.length;i++){
            array[i].doHomeWork();
            array[i].study();
            array[i].practice();
        }
    }
}
