package TestNG_basics;

import org.testng.annotations.DataProvider;

public class DataOcean {

	
	@DataProvider  (indices = {0,2}) /*Name for Datarprovider method to use inside testcase*/
	public Object[][] Logininfo(){
		/*Creation of a two dimension array for user name and password*/
		Object[][] data = new Object[4][2];
		/*1.Correct user name and password*/
		data[0][0]  = "Admin";
		data[0][1]  = "admin123";
		/*2.Incorrect user name and password*/
		data[1][0]  = "IncorrectAdmin";
		data[1][1]  = "admin123";
		/*3.Correct user name and Incorrect password*/
		data[2][0]  = "Admin";
		data[2][1]  = "Incorrectadmin123";
		/*3.Incorrect user name and Incorrect password*/
		data[3][0]  = "IncorrectAdmin";
		data[3][1]  = "Incorrectadmin123";
		
		return data;}

	@DataProvider
	public String[] searchbox() {
		String[] data = new String[2];
		data [0] = "Apple MacBook Pro 13-inch";
		data [1] = "I know every thing ";
		return data;
		
	}

}
