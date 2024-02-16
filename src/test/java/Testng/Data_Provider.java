package Testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Data_Provider 
{
	@Test(dataProvider= "exdata")
	public void m1(String a, String b)
	{
		String c=a.concat(b);
		System.out.println(c);
		System.out.println("concatinated string is-->"+a+" "+b);
	}
	@DataProvider(name="exdata")
	public Object[][] data()
	{
		Object[][] data=new Object[3][2];
		data[0][0]="mindQ ";
		data[0][1]="systems";
		
		data[1][0]="selenium ";
		data[1][1]="manual";
		
		data[2][0]="testing ";
		data[2][1]="training";
		
		return data;
	}

}
