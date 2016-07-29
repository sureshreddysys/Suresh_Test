package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.carmax.com/");
		//create Action builder instance by passing webdriver instance
		
		Actions builder = new Actions(driver);
		Thread.sleep(3000);
	WebElement a=driver.findElement(By.linkText("Sell Your Car"));
	builder.moveToElement(a).build().perform();
driver.findElement(By.linkText("FAQ")).click();

	
	

	}

}
