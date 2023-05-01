package genericlibrary;

import java.io.IOException;



public class ezen_dataproviderdir {

	public String[][] readMultipleData(String sheet) throws IOException
	{
		String path=".\\TestData\\ALoginData.xlsx";//taking xl file from testData
	
		
		ezen_exceldirectory  xlutil=new ezen_exceldirectory (path);//creating an object for XLUtility
		
		int totalrows=xlutil.getRowCount(sheet);	
		int totalcols=xlutil.getCellCount(sheet,1);
				
		String logindata[][]=new String[totalrows][totalcols];//created for two dimension array which can store the data user and password
		
		for(int i=1;i<=totalrows;i++)  //1   //read the data from xl storing in two deminsional array
		{		
			for(int j=0;j<totalcols;j++)  //0    i is rows j is col
			{
				logindata[i-1][j]= xlutil.getCellData(sheet,i, j);  //1,0
			}
		}
	return logindata;//returning two dimension array
				
	}
}
