package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Inline {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/?gws_rd=ssl");
driver.findElement(By.xpath(".//*[@id='gbwa']/div[1]/a")).click();
driver.findElement(By.xpath(".//*[@id='gb36']/span[1]")).click();
driver.navigate().back();
	}

}
