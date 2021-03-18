package org.test.hcl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenMaven {
public static void main(String[] args) throws IOException  {
	

	File f = new File("C:\\Users\\AMULYA\\eclipse-workspace\\Maven1\\Excel\\sample2.xlsx");
	
	FileInputStream fin = new FileInputStream(f);
	Workbook w= new XSSFWorkbook(fin);
	Sheet sheet=w.getSheet("sheet1");
//	int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
//	System.out.println(physicalNumberOfRows);
	for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
		Row row = sheet.getRow(i);
		for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
			Cell cell = row.getCell(j);
			int cellType = cell.getCellType();
			if (cellType==1) {
				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);
				
			}else if (cellType==0) {
				if (DateUtil.isCellDateFormatted(cell)) {
					Date dateCellValue = cell.getDateCellValue();
					SimpleDateFormat simple=new SimpleDateFormat("dd-MM-yyyy");
					String format = simple.format(dateCellValue);
					System.out.println(format);
				}
				else {
					double numericCellValue = cell.getNumericCellValue();
					int l=(int)numericCellValue;
					String valueOf = String.valueOf(l);
					System.out.println(valueOf);
				}
				
			}
		}
	}

	
//	Cell createCell = row.createCell(3);
//	createCell.setCellValue("hygj");
	
//int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
//System.out.println(pdahysicalNumberOfRows);


	
		
//int physicalNumberOfCells = row.getPhysicalNumberOfCells();
//System.out.println(physicalNumberOfCells);
	
//	FileOutputStream fout = new FileOutputStream(f);
//	w.write(fout);
//	System.out.println("done");
	

	
	
		
	}
	
	
}

