package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Image1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// open url
		driver.get("https://www.google.com");
		boolean a=driver.findElement(By.id("hplogo")).isDisplayed();
		System.out.println(a);
		String b=driver.findElement(By.id("hplogo")).getAttribute("value");
		System.out.println(b);
		driver.navigate().to("http://newtours.demoaut.com/");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		driver.navigate().to("http://www.seleniumhq.org/projects/");
		Thread.sleep(3000);
		driver.findElement(By.className("icon")).click();
		
	}
	

}
