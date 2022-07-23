package class30;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesCreateFileDemo {
    public static void main(String[] args) throws IOException {
        // Path where we want to create the file
        String path ="Files/Ozkan.properties";
        // We need to go to that path to create this file
        //programmatically this is how we do that

        FileOutputStream fileOutputStream = new FileOutputStream(path);
        // Create the object of the properties class to store properties inside the file
        Properties properties = new Properties();
        // We store key value pair inside the object
        properties.setProperty("Student","true");
        // store the data in the form of a file on our hard-drive
        properties.store(fileOutputStream, "A new property has been added");
        // close that file
        fileOutputStream.close();

    }
}
