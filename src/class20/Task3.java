package class20;

public class Task3 {
    /*
    Write a Java program called Teacher.  Identify features and behaviour of that Class.
     Create 3 subclasses MathTeacher, ChemistryTeacher and
    PianoTeacher that would have it their own features and behaviour. Test all 4 classes
     */
    public static void main(String[] args) {
        ChemistryTeacher chemistryTeacher=new ChemistryTeacher();
        chemistryTeacher.name="Adem";
        chemistryTeacher.favoriteChemSubject="Organic";
        chemistryTeacher.teachesChem();
    }
}
class Teacher {
    String name;
    String typeOfTeacher;

    void teach(){
        System.out.println(name+" Teaches "+typeOfTeacher);
    }
}
class MathTeacher extends Teacher {
    String favoriteMathSubject;

    public void teachesMath(){
        System.out.println(name+" teaches math and his favorite subject is"+favoriteMathSubject);
    }
}
class ChemistryTeacher extends Teacher{
    String favoriteChemSubject;
    public void teachesChem(){
        System.out.println(name+" teaches Chemistry and his favorite chemistry subject is "+favoriteChemSubject);
    }
}
class PianoTeacher extends Teacher{
    String favoriteModelOfPiano;
    public void teachesPiano(){
        System.out.println(name+" teaches Piano and his favorite Piano model is "+favoriteModelOfPiano);
    }
}