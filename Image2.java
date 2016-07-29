package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Image2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// open url
		driver.get("https://www.google.com");
		WebElement a=driver.findElement(By.className("gb_P"));
		a.click();
	
	
	}
	
	

}
