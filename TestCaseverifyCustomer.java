package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseverifyCustomer {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gcrit.com/build3/");
		driver.findElement(By.linkText("create an account")).click();
		driver.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[1]/td[2]/input[1]")).click();
		driver.findElement(By.name("driver.findElement(By")).sendKeys("Suresh");
		driver.findElement(By.name("lastname")).sendKeys("Gundreddy");
		driver.findElement(By.name("email_address")).sendKeys("gunreddysureshreddy@gmail.com");
	
	}

}
