package com.fiberhome.excel2007;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
/**
 * @Description:
 * @author zsj
 * @date 2017年3月1日 下午2:39:25
 */
public class WriteData {
	static XSSFRow row;
	public static void main(String[] args)throws Exception {
		write();
	}
	//往Excel单元格指定cell写东西
	public static void write() throws Exception{
		FileInputStream fis = new FileInputStream(new File("D:/企业信息模板.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet spreadsheet = workbook.getSheetAt(0);
		XSSFRow row;
		XSSFCell cell1;
		XSSFCell cell2;
		XSSFCell cell3;
		XSSFCell cell4;
		XSSFCell cell5;
		XSSFCell cell6;
		int rowNum = spreadsheet.getLastRowNum();// 总行数
		System.out.println(rowNum);
		for(int i=1;i<=rowNum-1;i++){
			row = spreadsheet.getRow(i);
			cell1 = row.getCell(0);//企业名称
			cell1.setCellType(Cell.CELL_TYPE_STRING);
			cell1.setCellValue("烽火"+i);
			cell2 = row.getCell(5);//企业类型
			cell2.setCellType(Cell.CELL_TYPE_NUMERIC);
			cell2.setCellValue(1d);
			cell3 = row.getCell(6);//所属行业
			cell3.setCellType(Cell.CELL_TYPE_NUMERIC);
			cell3.setCellValue(1d);
			cell4 = row.getCell(7);//企业规模
			cell4.setCellType(Cell.CELL_TYPE_NUMERIC);
			cell4.setCellValue(1d);
			cell5 = row.getCell(11);//联系人
			cell5.setCellType(Cell.CELL_TYPE_STRING);
			cell5.setCellValue("admin"+i);
			cell6 = row.getCell(12);//联系电话
			cell6.setCellType(Cell.CELL_TYPE_STRING);
			cell6.setCellValue("0738");
		}
		saveExcel(workbook);
		fis.close();
	}
	//往Excel写完之后要保存
	private static void saveExcel(XSSFWorkbook wb) {  
        FileOutputStream fileOut;  
        try {  
            fileOut = new FileOutputStream(new File("D:/企业信息模板.xlsx"));  
            wb.write(fileOut);  
            fileOut.close();  
        } catch (FileNotFoundException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
  
    }  
	//查看Excel2007以上版本
	public static void scanExcel() throws Exception {
		FileInputStream fis = new FileInputStream(new File("D:/企业信息模板.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet spreadsheet = workbook.getSheetAt(0);
		Iterator<Row> rowIterator = spreadsheet.iterator();
		while (rowIterator.hasNext()) {
			row = (XSSFRow) rowIterator.next();
			Iterator<Cell> cellIterator = row.cellIterator();
			while (cellIterator.hasNext()) {
				Cell cell = cellIterator.next();
				switch (cell.getCellType()) {
				case Cell.CELL_TYPE_NUMERIC:
					System.out.print(cell.getNumericCellValue() + " \t\t ");
					break;
				case Cell.CELL_TYPE_STRING:
					System.out.print(cell.getStringCellValue() + " \t\t ");
					break;
				}
			}
			System.out.println();
		}
		fis.close();
	}
	//暂时没生效，生成row
	private XSSFRow createRow(XSSFSheet sheet, Integer rowIndex) {  
        XSSFRow row = null;  
        if (sheet.getRow(rowIndex) != null) {  
            int lastRowNo = sheet.getLastRowNum();  
            sheet.shiftRows(rowIndex, lastRowNo, 1);  
        }  
        row = sheet.createRow(rowIndex);  
        return row;  
    }  

}
