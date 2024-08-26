package testng;

import org.testng.annotations.Test;

public class InvocationCountTest {

	@Test(invocationCount=10)
	public void Sum()
	{
		int a=1;
		int b=2;
		int c =a+b;
		System.out.println(c);
		System.out.println(c);
		System.out.println(c);
		System.out.println(c);
		
	}
	
	
	
}
