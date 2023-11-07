package TestNG_basics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class assertion02 {
	
	@BeforeSuite
	public void Beforesuite() {
		
		System.out.println("Beforesuite method");
	}
	
	@AfterSuite
	public void Aftersuite() {
		
		System.out.println("Aftersuite method");
	}
	
	@BeforeClass
	public void Beforeclass() {
		
		System.out.println("Beforeclass method");
	}
	
	@AfterClass
	public void Afterclass() {
		
		System.out.println("Afterclass method");
	}
	
	@BeforeMethod
	public void Beforemethod() {
		
		System.out.println("Beforemethod method");
	}
	
	@AfterMethod
	public void Aftermethod() {
		
		System.out.println("Aftermethod method");
	}
	
	@BeforeTest
	public void Beforetest() {
		
		System.out.println("Beforetest method");
	}
	
	@Test
   public void test() {
		
		System.out.println("test method");
	}

	@AfterTest
  public void Aftertest() {
	
	System.out.println("Aftertest method");
}

}
