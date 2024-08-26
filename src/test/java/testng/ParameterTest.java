package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class ParameterTest {

	WebDriver driver;
	
	@Test
	@Parameters({"browser","url","emailid"})
	public void YahooTest(String browser,String url,String emailid)
	{
 if(browser.equals("chrome"))
 {
	 driver = new ChromeDriver(); 
 }
 else {
	 driver=new FirefoxDriver();
 }
		 driver.get(url);
		 
		driver.findElement(By.xpath("//input[@id='login-username']")).clear();
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys(emailid);
		driver.findElement(By.id("login-signin")).click();
		
	}
	
	
}