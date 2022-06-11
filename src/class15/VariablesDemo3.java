package class15;

public class VariablesDemo3 {
    static int num=5;
    String name;

    public static void main(String[] args) {
        VariablesDemo3 v3 = new VariablesDemo3();
        v3.name="Naveed";

        VariablesDemo3 v4 = new VariablesDemo3();
        v4.name="Jason";

        VariablesDemo3 v5 = new VariablesDemo3();
        v5.name="Mumtaz";

        System.out.println(v3.name);
        System.out.println(v3.num);

        System.out.println(v4.name);
        System.out.println(v4.num);
    }
}
