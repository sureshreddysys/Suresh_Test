package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Class2Test {
@Test(priority=1)
	public void GmailLogin() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\selenium eclipse\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	//open the google website
	driver.get("https://www.google.com");
	Thread.sleep(5000);
	driver.findElement(By.id("gb_70")).click();
	Thread.sleep(5000);
	driver.findElement(By.id("Email")).sendKeys("sureshreddy.ow@gmail.com");
	Thread.sleep(5000);
	driver.findElement(By.id("next")).click();
	Thread.sleep(5000);
	driver.findElement(By.id("Passwd")).sendKeys("Saideva@11");
	Thread.sleep(5000);
	driver.findElement(By.id("signIn")).click();
	Thread.sleep(5000);
	driver.findElement(By.linkText("Gmail")).click();
	

	}

}
