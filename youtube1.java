package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtube1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		//driver.findElement(By.id("Email")).sendKeys("India");
		/*WebElement Email= driver.findElement(By.id("Email"));
		Email.sendKeys("London");
		Email.clear();*/		

/*driver.get("https://www.youtube.com");
Thread.sleep(5000);
driver.findElement(By.className("yt-uix-button yt-uix-sessionlink yt-uix-button-default yt-uix-button-size-default")).click();*/
//driver.findElement(By.tagName("a")).click();
//driver.findElement(By.linkText("Gmail")).click();
		//driver.findElement(By.partialLinkText("Gma")).click();
		//driver.findElement(By.cssSelector(".gb_P")).click();
		driver.findElement(By.xpath("Gmail")).click();

	}

}
