package testng;

import org.testng.annotations.Test;

public class TestngFeature {

	
	@Test
	public void Login()
	{
		System.out.println("login to website successful");
		int i =1/0;
	}
	
	@Test(dependsOnMethods="Login")
	public void Homepage()
	{
		System.out.println("homepage screen");
	}
	
	@Test(dependsOnMethods="Homepage")
	public void ClickOnLink()
	{
		System.out.println("link is working");
	}
	
	@Test(dependsOnMethods="Homepage")
	public void ClickOnLink1()
	{
		System.out.println("link is working");
	}
	
	@Test(dependsOnMethods="Homepage")
	public void ClickOnLink2()
	{
		System.out.println("link is working");
	}
	
	
}
