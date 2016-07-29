package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import org.junit.*;

public class TestNGCase1 {
	public WebDriver driver;

	@Test(priority=1)
	public void LaunchBrowser(){
		System.setProperty("webdriver.chrome.driver", "C:\\selenium eclipse\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver();
	}
		
	@Test(priority=2)
	public void verifyPageTitle(){
	driver.get("https://www.gmail.com");
	Assert.assertEquals("Gmail", driver.getTitle());
	
	}
	@Test(priority=3)
	public void navigateTo(){
		
	driver.navigate().to("https://www.yahoo.com");
	Assert.assertEquals("Yahoo", driver.getTitle());
	
	
}
	@Test(priority=4)
	public void close(){
		driver.close();
	}
	

}
