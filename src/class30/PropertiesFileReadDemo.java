package class30;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileReadDemo {
    public static void main(String[] args) throws IOException {
        // Get the path of the file
        /*
        steps to get the path in intellij
        1.Right click on any file
        2.click on get path reference
        3.select content root path
         */
        String path = "Files/Abdul.properties";

        // Navigate to the location with the help of FileInputStream class if
        // we want to read the data or FilOutputStream if we want to write the data
        // to file
        FileInputStream fileInputStream = new FileInputStream(path);

        // Now we need a class that understands how to read the data from this file type
        Properties properties = new Properties();

        // loading the data from the file inside the properties Object
        properties.load(fileInputStream);
        System.out.println(properties.getProperty("user"));

        // we close this file to save system resources
        fileInputStream.close();



    }
}
