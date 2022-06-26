package class24;

public abstract class DataBase {
    abstract void open();
    abstract void readData();
    abstract boolean writeData();
    public void closeTheDataBase(){
        System.out.println("Terminate the connection to close it");
    }

}
class Informix extends DataBase {
    @Override
    void open() {
        System.out.println("Opening the Informix database class");
    }

    @Override
    void readData() {
        System.out.println("Reading the data from the Informix");
    }

    @Override
    boolean writeData() {
        System.out.println("Data written successfully");
        return true;
    }

}
class MySQlServer extends DataBase {
    void open() {
        System.out.println("Opening the MySQlServer database class");
    }

    @Override
    void readData(){
        //System.out.println("Reading the data from the MySQlServer");
    }

    @Override
    boolean writeData() {
        System.out.println("Data written successfully");
        return true;
    }

}
