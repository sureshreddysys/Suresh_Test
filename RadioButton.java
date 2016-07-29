package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/?stype=lo&jlou=Aff9qjeEV4VxTz-UlFz8CMNXJs1MaFGdms9OHaip1fcDZgsk3C4RcpWRqG3sxHIdYh0s_GPWGoclVlUpKRM6wvzzkILuVftb5flqF01uAFi9oA&smuh=1389&lh=Ac9F1omfXz9KtoGQ");
		WebElement ab=driver.findElement(By.className("_58mt"));
		boolean abc=ab.isDisplayed();
		System.out.println(abc);
		System.out.println(ab.isEnabled());
		System.out.println(ab.isSelected());
		ab.click();
		System.out.println(ab.isSelected());
		
		
			

	}

}
