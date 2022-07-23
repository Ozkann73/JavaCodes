package class30;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelDemo {
    public static void main(String[] args) throws IOException {
        // location of the file on the computer
        String path = "Files/SdetBatch13.xlsx";

        // navigating to the file
        FileInputStream fileInputStream = new FileInputStream(path);

        //class that understand how Excel files work
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);

        //Excel files are divided into sheets and we can access any sheet by providing its name
        Sheet sheet = xssfWorkbook.getSheet("Sheet1");

        //Sheet have rows and cells (columns) we need to specify the row number and cell
        // number as well
        //rows and columns they also start from index 0
        Row row = sheet.getRow(1);
        Cell cell = row.getCell(0);
        System.out.println(cell);
        fileInputStream.close();

    }
}
