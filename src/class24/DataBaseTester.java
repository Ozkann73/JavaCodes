package class24;

public class DataBaseTester {
    public static void main(String[] args) {
        DataBase [] array ={new Informix(),new MySQlServer()};

        for (DataBase arr :array){
            arr.open();
            arr.readData();
            arr.writeData();
            arr.closeTheDataBase();
        }
    }
}
