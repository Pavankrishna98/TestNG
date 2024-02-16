package Testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testng1 {
	public RemoteWebDriver driver;
	@BeforeMethod 
	public void open_Browser() 
	{
	 WebDriverManager.chromedriver().setup(); 
	 driver=new ChromeDriver();
	 driver.get("https://facebook.com"); 
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 System.out.println("@Before Method code has run successfully"); 
	 }
	 @Test(priority = 0) public void m1() 
	 {
	 driver.findElement(By.id("email")).sendKeys("pavan");
	 driver.findElement(By.id("pass")).sendKeys("haskedj");
	 driver.findElement(By.name("login")).click();
	 System.out.println("@Test method code has run successfully"); 
	 }
	 @AfterMethod 
	 public void close_Browser() throws InterruptedException 
	 {
	 Thread.sleep(5000); 
	 driver.navigate().back(); 
	 Thread.sleep(5000); 
	 driver.close(); 
	 System.out.println("@After Method code has run successfully"); 
	 }
	 @Test(priority = 1, enabled = true) 
	 public void m2() 
	 {
	 driver.findElement(By.xpath("//a[@title='Sign up for Facebook']"));
	 System.out.println("@test 2 method has run"); 
	 }
	 

	@BeforeSuite
	public void a1() {
		System.out.println("this is before suite");
	}

	@BeforeTest
	public void a2() {
		System.out.println("this is before test");
	}

	@BeforeClass
	public void a3() {
		System.out.println("this is before class");
	}

	@BeforeMethod
	public void a14() {
		System.out.println("this is before method");
	}

	@Test(groups= {"test"})
	public void a15() {
		System.out.println("this is @Test");
	}

	@AfterMethod
	public void a16() {
		System.out.println("this is after method");
	}

	@Test
	public void a25() {
		System.out.println("this is @Test2");
	}

	@AfterClass
	public void a7() {
		System.out.println("this is after class");
	}

	@AfterTest
	public void a8() {
		System.out.println("this is after test");
	}

	@AfterSuite
	public void a9() {
		System.out.println("this is after suite");
	}

}
