package TestNG_basics;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SumandMulitply {
	
	@Parameters({"a","b"})
	@Test
	public void sum(int a,int b) {
		
		int sum = a+b;
		System.out.println("The sum of output   = "+sum);
	}
	@Parameters({"a","b"})
	@Test
    public void Multiply(int a,int b) {
		
		int Multiply = a*b;
		System.out.println("The Multiply of output  = "+ Multiply);
	}

}
