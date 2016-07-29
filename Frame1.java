package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");
		Thread.sleep(3000);
		/*driver.switchTo().frame(2);
		driver.findElement(By.xpath("html/body/div[3]/table/tbody[2]/tr[1]/td[1]/a")).click();*/
		//switch to frame 3
		Thread.sleep(3000);
		driver.switchTo().frame("classFrame");
		//operate an element
		driver.findElement(By.xpath("html/body/div[3]/table/tbody[2]/tr[1]/td[1]/a")).click();
		//switch from 3rd frame to top window
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		//switch to first frame
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.xpath(".//*[@id='gb36']/span[1]")).click();

	}

}
