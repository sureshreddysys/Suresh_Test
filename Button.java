package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\selenium eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// open url
		driver.get("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#identifier");
		WebElement a= driver.findElement(By.xpath(".//*[@id='next']"));
		a.click();
		System.out.println(a.isDisplayed());
		System.out.println(a.isEnabled());
		System.out.println(a.getAttribute("type"));
		System.out.println(a.getAttribute("name"));
		System.out.println(a.getAttribute("value"));

	}

}
