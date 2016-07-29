package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/?stype=lo&jlou=Aff9qjeEV4VxTz-UlFz8CMNXJs1MaFGdms9OHaip1fcDZgsk3C4RcpWRqG3sxHIdYh0s_GPWGoclVlUpKRM6wvzzkILuVftb5flqF01uAFi9oA&smuh=1389&lh=Ac9F1omfXz9KtoGQ");
Select Dropdown= new Select(driver.findElement(By.id("month")));
//Dropdown.selectByIndex(1);
//Dropdown.selectByIndex(2);
//Dropdown.selectByVisibleText("Jan");
List<WebElement> e= Dropdown.getOptions();
int itemscount =e.size();
System.out.println(itemscount);


	}

}
