//Gmail Login
package selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selenium1 {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// open url
		driver.get("http://www.google.com");
		// click on gmail
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

