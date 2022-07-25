package class30;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class HomeWork {
    public static void main(String[] args) throws IOException {
        String path = "Files/Facebook.properties";
        FileInputStream fileInputStream = new FileInputStream(path);
        Properties properties = new Properties();
        properties.load(fileInputStream);

        System.out.println(properties.getProperty("username"));
        System.out.println(properties.getProperty("password"));
        System.out.println(properties.getProperty("url"));
        System.out.println(properties.getProperty("browser"));
        fileInputStream.close();

    }
}
