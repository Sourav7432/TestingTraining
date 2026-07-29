package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {

    XSSFWorkbook workbook;
    XSSFSheet sheet;

    public ExcelDataProvider() throws IOException {

        File src = new File("./TestData/LoginData.xlsx");

        FileInputStream fis = new FileInputStream(src);

        workbook = new XSSFWorkbook(fis);
    }

   
    public String getStringData(String sheetName, int row, int col) {

        sheet = workbook.getSheet(sheetName);

        return sheet.getRow(row).getCell(col).getStringCellValue();
    }

   
    public double getNumericData(String sheetName, int row, int col) {

        sheet = workbook.getSheet(sheetName);

        return sheet.getRow(row).getCell(col).getNumericCellValue();
    }
}