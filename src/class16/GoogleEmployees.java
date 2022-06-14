package class16;

public class GoogleEmployees {
    String name;
    double salary;
    static int numOfEmployees;
    String companyName="Tesla";

    void displayEmployeeInfo (){
        System.out.println("Name "+name+" "+" Company name "+companyName+" Salary "+salary+numOfEmployees);
    }

    public static void main(String[] args) {
        GoogleEmployees emp1 = new GoogleEmployees();
        emp1.name="Ozkan";
        emp1.salary=250000;


        GoogleEmployees emp2 = new GoogleEmployees();
        emp2.name="Mirhan";
        emp2.salary=1550000;
        emp2.numOfEmployees=2;
        emp1.displayEmployeeInfo();
        emp2.displayEmployeeInfo();


    }
}
