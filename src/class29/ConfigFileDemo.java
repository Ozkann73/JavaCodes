package class29;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileDemo {
    public static void main(String[] args) throws IOException {
        // This demo shows How to read properties file
        // Steps to read a file ;
        // We need to know the path/location of that file
        String path ="Files/Config.properties";
        // Navigating to that path where file is stored
        FileInputStream fileInputStream = new FileInputStream(path);
        // We need to have a special software that understands that file that
        // we can use to open and edit that file

        Properties properties = new Properties();
        properties.load(fileInputStream);
        System.out.println(properties.getProperty("user"));
        System.out.println(properties.getProperty("password"));
        System.out.println(properties.getProperty("URL"));

        fileInputStream.close();

    }
}
