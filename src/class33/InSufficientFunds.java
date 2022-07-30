package class33;

public class InSufficientFunds extends  RuntimeException {
    // To create a custom exception simply ;
    // Create a class and extend it from RuntimeException or any other
    // Exception if you want to create a checked exception extend from Exception class otherwise
    //RuntimeException
    InSufficientFunds (String message){
        super(message);
    }
}
