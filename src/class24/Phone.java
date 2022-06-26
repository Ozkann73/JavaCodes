package class24;

public abstract class Phone {
    abstract void displayPictures();

    abstract void unlock();

    void sendText (){
        System.out.println("Use the messanger app to send the message ");
    }
}

class Iphone extends Phone {
    @Override
    void displayPictures() {
        System.out.println("Use the Photos app to display the picture");
    }

    @Override
    void unlock() {
        System.out.println("Use FaceId to unlock the phone");
    }
}

 class Samsung extends Phone {

     @Override
     void displayPictures() {
         System.out.println("Use the gallery app to display the pictures");
     }

     @Override
     void unlock() {
         System.out.println("Use finger print sensor or face unlock to unlock your phone");
     }
 }

class Tester {
    public static void main(String[] args) {
        Samsung samsung = new Samsung();
        samsung.displayPictures();


    }
}



