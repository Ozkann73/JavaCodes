package class16;

public class InstanceDemo {
    String str ="instance";

    void changeValue (){
        str="metod1";
    }
    void printValue(){
        System.out.println(str);
    }

    public static void main(String[] args) {
        InstanceDemo id = new InstanceDemo();
        System.out.println(id.str);
        id.printValue();
        id.changeValue();
        id.printValue();
    }
}
