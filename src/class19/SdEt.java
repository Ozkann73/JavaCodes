package class19;

public class SdEt extends Human{
    boolean goodWithJava;
    SdEt(String name, String eyeColor, String job, int age,boolean goodWithJava){
        this.name=name;
        this.eyeColor=eyeColor;
        this.job=job;
        this.age=age;
        this.goodWithJava=goodWithJava;
    }
    void printInfo(){
        System.out.println("My name is "+name+" i do "+job+" am i good with java "+goodWithJava);
    }

    public static void main(String[] args) {
        SdEt sdEt = new SdEt("Sameer","black","gym",22 ,true);
        sdEt.printInfo();
    }
}
