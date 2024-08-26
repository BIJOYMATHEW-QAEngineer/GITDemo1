package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicsofTestNG {

	// starting with the keyword @Before --> is know as pre- condition or pre-reprosite condition
	//Starting with the keyword @After --> is know as post-condition or post-reprosite condition
	//Starting with the keyword @Test ---> is know as the test case 
	
	
	@BeforeSuite //1
	public void SetupBrowse()
	{
		System.out.println("Setup browser setup in the project1");
		System.out.println("Setup browser setup in the project2");
		System.out.println("Setup browser setup in the project3");
		System.out.println("Setup browser setup in the project4");
	
	}
	@BeforeTest//2
	public void LaunchBrowser() {
		System.out.println("launch chromebrowse");
	}

	@BeforeClass//3
	public void Login() {
		System.out.println("login to the website");
	}

	@BeforeMethod//4
	public void EnterURL() {
		System.out.println("URL entered");
	}


	
	@Test //5
	public void googleTitletext()
	{
		System.out.println("google title text");
	}
	
	@Test
	public void Search()
	{
		System.out.println("searchText");
		}
	
	@Test
	public void newSearch()
	{
		System.out.println("newsearch");
	}
	
	@AfterMethod //6
	public void Logout()
	{
		System.out.println("Logut from website");
	}
	
	@AfterClass //7
	public void ClearCache()
	{
		System.out.println("Delete all cookies");
	}
	
	@AfterTest //8
	public void CloseBrowser()
	{
		System.out.println("Close the current browser");
	}
/*	
	@AfterSuite  //9
	public void GenerateReport()
	{
		System.out.println("Generate report from testng");
	}
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
