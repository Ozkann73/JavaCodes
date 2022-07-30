package class33;

public class InSufficientException {
    public static void main(String[] args) {
        double balance =100;
        double transferAmount=120;
        if (transferAmount>balance){
            //System.out.println("Insufficient funds");
            throw new InSufficientFunds("InSuffiecient funds");
        }else {
            System.out.println("Funds Transferred successfully ");
        }
    }
}
