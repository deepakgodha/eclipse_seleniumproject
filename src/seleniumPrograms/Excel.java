package seleniumPrograms;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	Workbook wb;
	public Excel(String path)
	{
		try {
			if(path.endsWith(".xls"))
			{
				wb=new HSSFWorkbook(new FileInputStream(path));
			}
			else if(path.endsWith(".xlsx"))
			{
				wb=new XSSFWorkbook(new FileInputStream(path));
				
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	public String getData(String SheetName,int row,int col)
	{
		String data=wb.getSheet(SheetName).getRow(row).getCell(col).toString();
		return data;
	}
	public int getRowNum(String SheetName)
	{
		int row=wb.getSheet(SheetName).getLastRowNum()+1;
		return row;
	}
	public int getColNum(String SheetName)
	{
		int col=wb.getSheet(SheetName).getRow(0).getLastCellNum();
		return col;
	}
	

}
