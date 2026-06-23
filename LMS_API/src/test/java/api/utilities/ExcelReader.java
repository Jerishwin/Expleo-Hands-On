package api.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

    public static Object[][] getData(String fileName, String sheetName) {

        try (FileInputStream fis =
                     new FileInputStream("src/test/resources/testData/" + fileName);
             XSSFWorkbook wb = new XSSFWorkbook(fis)) {

            XSSFSheet sheet = wb.getSheet(sheetName);

            if (sheet == null) {
                throw new RuntimeException("Sheet not found: " + sheetName);
            }

            int totalRows = sheet.getPhysicalNumberOfRows();
            int totalCols = sheet.getRow(0).getLastCellNum();

            Object[][] data = new Object[totalRows - 1][totalCols];

            int rowIndex = 0;

            for (int i = 1; i < totalRows; i++) {

                XSSFRow row = sheet.getRow(i);

                if (row == null) {
                    continue;
                }

                boolean isEmpty = true;

                for (int j = 0; j < totalCols; j++) {

                    XSSFCell cell = row.getCell(j);
                    Object value = "";

                    if (cell != null) {

                        switch (cell.getCellType()) {

                            case BOOLEAN:
                                value = cell.getBooleanCellValue();
                                break;

                            case NUMERIC:
                                if (DateUtil.isCellDateFormatted(cell)) {
                                    value = cell.getDateCellValue();
                                } else {
                                    double num = cell.getNumericCellValue();

                                    if (num == (int) num) {
                                        value = (int) num;
                                    } else {
                                        value = num;
                                    }
                                }
                                break;

                            case STRING:

                                String str = cell.getStringCellValue().trim();

                                if (str.equalsIgnoreCase("true")
                                        || str.equalsIgnoreCase("false")) {

                                    value = Boolean.parseBoolean(str);

                                } else {

                                    try {
                                        value = Integer.parseInt(str);
                                    } catch (NumberFormatException e) {
                                        value = str;
                                    }
                                }

                                break;

                            case BLANK:
                                value = "";
                                break;

                            default:
                                value = cell.toString().trim();
                        }
                    }

                    if (!value.toString().isEmpty()) {
                        isEmpty = false;
                    }

                    data[rowIndex][j] = value;
                }

                if (!isEmpty) {
                    rowIndex++;
                }
            }

            return Arrays.copyOf(data, rowIndex);

        } catch (IOException e) {
            throw new RuntimeException(
                    "Failed to read Excel file: " + fileName, e);
        }
    }
}