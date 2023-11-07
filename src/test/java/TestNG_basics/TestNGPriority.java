package TestNG_basics;

import org.testng.annotations.Test;

public class TestNGPriority {
	
	@Test  (priority = -2)
	public void login () {
		
		System.out.println("login");
	}
     
	@Test (priority = -1)
    public void homepage () {
		
		System.out.println("homepage");
	}
	@Test (priority = 0)
    public void Bookticket () {
	
	System.out.println("Book ticket");
    }
    @Test  (priority = 1)
	public void Makepayment () {
	
	System.out.println("makepayment");
    }
    @Test   (priority = 3)
    public void logout () {
	
	System.out.println("logout");
}
	
}
