package keyworddriven;

import org.testng.annotations.Test;

import seleniumPrograms.Excel;

import org.testng.annotations.DataProvider;

public class KeyRunner extends BaseClass {
  @Test(dataProvider = "dp")
  public void excelKeyRunner(String exKey, String ltype,String lvalue, String data) {
	  KeyWordDriven key=new KeyWordDriven(driver);
	  if(exKey.equals("getURL"))
	  {
		  key.getURL(data);
	  }
	  else if(exKey.equals("selectFromDropDown"))
	  {
		  key.selectDropDown(ltype, lvalue, data);
	  }
	  else if(exKey.equals("click"))
	  {
		  key.doClick(ltype, lvalue);
	  }
	  else if(exKey.equals("getSnap"))
	  {
		  key.getSnap(data);
	  }
	  else if(exKey.equals("type"))
	  {
		  key.getKeys(ltype, lvalue, data);
	  }
	  else
	  {
		  System.out.println("invalid");
	  }
	  
  }

  @DataProvider
  public Object[][] dp() {
    Excel ex=new Excel("E://Book1.xlsx");
    Object data[][]=new Object[ex.getRowNum("Sheet5")-1][ex.getColNum("Sheet5")];
    for (int i=0;i<data.length;i++)
    {
    	data[i][0]=ex.getData("Sheet5", i+1, 0);
    	data[i][1]=ex.getData("Sheet5", i+1, 1);
    	data[i][2]=ex.getData("Sheet5", i+1, 2);
    	data[i][3]=ex.getData("Sheet5", i+1, 3);
    }
    return data;
    
    
  }
}
