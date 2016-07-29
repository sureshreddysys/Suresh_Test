package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/SURESH%20REDDY/workspace/Test/src/selenium/webtable.html");
		String webelement = driver.findElement(By.xpath("html/body/table/tbody/tr[1]/td[1]")).getText();
		WebElement html = driver.findElement(By.id("table1"));
		System.out.println(webelement);
		List<WebElement> rows = html.findElements(By.tagName("tr"));
		int r = rows.size();
		System.out.println(r);
		List<WebElement> cells = html.findElements(By.tagName("td"));
		int d = cells.size();
		System.out.println(d);
	}

}
