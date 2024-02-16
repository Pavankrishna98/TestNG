package Testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice1 
{
	public static void main(String[] args)throws Exception
	{
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver  = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("email")).sendKeys("hi hello");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("namaste");
		
		driver.findElement(By.id("loginbutton")).click();
		
		System.out.println("Login button clicked");
		
		Thread.sleep(5000);
		}

}
