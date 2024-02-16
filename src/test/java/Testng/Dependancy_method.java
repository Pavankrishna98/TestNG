package Testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dependancy_method
{
	RemoteWebDriver driver;
	
	@Test(priority=0)
	public void open()throws Exception
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	
	@Test(priority=1, dependsOnMethods = {"open"}, dataProvider="lgndata")
	public void uid(String a, String b)
	{
		driver.findElement(By.name("username")).sendKeys(a);
		driver.findElement(By.name("password")).sendKeys(b);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@DataProvider(name="lgndata")
	public Object[][] data()
	{
		Object[][] o=new Object[1][2];
		o[0][0]= "Admin";
		o[0][1]="admin123";
		return o;
	}

}
