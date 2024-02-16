package Testng;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Groups 
{
	

	@BeforeMethod
	public void a14() {
		System.out.println("this is before method");
	}

	@Test(groups= {"test"}, priority=1)
	public void a15() {
		System.out.println("this is @Test");
	}

	@AfterMethod
	public void a16() {
		System.out.println("this is after method");
	}

	@Test(groups= {"test"}, priority=2)
	public void a25() {
		System.out.println("this is @Test2");
	}
	
	@Test(groups= {"test"}, priority=3)
	public void a26() {
		System.out.println("this is @Test2");
	}
	
	@Test(groups= {"test"}, priority=4)
	public void a27() {
		System.out.println("this is @Test2");
	}
	
	@Test(groups= {"interview"}, priority=5)
	public void interview() {
		System.out.println("first round");
	}
	
	@Test(groups= {"interview"}, priority=6)
	public void interview2() {
		System.out.println("second round");
	}
	
	@Test(groups= {"interview"}, priority=6)
	public void interview3() {
		System.out.println("third round");
	}
	
	@Test(groups= {"interview"}, priority=6)
	public void interview4() {
		System.out.println("fourth round");
	}

	
	

}
