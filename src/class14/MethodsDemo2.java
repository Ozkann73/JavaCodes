package class14;

public class MethodsDemo2 {
    void printGreat (){
        for (int i=1; i<=5; i++){
            System.out.println("Batch13 is great");
        }
    }
    void printManyTimes(int times){
        for (int i=1; i<=times; i++){
            System.out.println("Batch13 is great");
    }
    }

    public static void main(String[] args) {
        MethodsDemo2 met = new MethodsDemo2();
        met.printGreat();
        met.printManyTimes(2);

    }
}
