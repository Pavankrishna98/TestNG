package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Data_provider_2
{
	@Test(dataProvider="exampledata")	//for data provider name can also be given and also method name can also be given for data provider key word
	public void m2(String a, String b)throws Exception
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys(a);
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys(b);
		Thread.sleep(2000);
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(3000);
		driver.close();
	}
	
	@DataProvider
	public Object[][] exampledata()
	{
		Object[][] ed= new Object[2][2];		//{{"Admin","admin123"}}(for single array data)
		ed[0][0]="hi";
		ed[0][1]="hello";		
		
		ed[1][0]="selenium";
		ed[1][1]="manual";
		
		return ed;
	}

}
