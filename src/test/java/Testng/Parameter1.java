package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameter1
{
	RemoteWebDriver driver;
	@BeforeTest
	public void Open()throws Exception
	{
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	
	@Test
	@Parameters({"uid","pwd"})
	public void m1( String uid_name,  String pwd_name)throws Exception
	{
		driver.findElement(By.id("email")).sendKeys(uid_name);
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys(pwd_name);
		Thread.sleep(2000);
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(2000);
	}

	@AfterMethod
	public void close()
	{
		driver.close();
	}
}
