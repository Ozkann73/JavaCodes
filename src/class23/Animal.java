package class23;

public  class Animal {

    Animal(){
        System.out.println("Parent");
    }
     void eat (){
        System.out.println("All the animals eat");
    }
}
class Panda extends Animal{
   // no other class can inherit from Animal class bcs its declared as Final
   void eat (){
       System.out.println("All the animals eat");
   }
   Panda(){
       System.out.println("Child");
   }
}
class Tester {
    public static void main(String[] args) {
        new Panda();
    }
}
