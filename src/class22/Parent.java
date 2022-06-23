package class22;

public class Parent {
    String name;
    void getMarried(){
        System.out.println("We found a girl for you to marry");
    }
}
class Hamid extends Parent{

    void getMarried(){
        super.getMarried();
        System.out.println("I wanr to try on Tara First");


}

    public static void main(String[] args) {
        Hamid hamid = new Hamid();
        hamid.getMarried();
    }
}
