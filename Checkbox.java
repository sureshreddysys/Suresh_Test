package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
driver.get("https://www.utexas.edu/learn/forms/checkboxes.html");
System.out.println(driver.findElement(By.id("graphics")).isDisplayed());
System.out.println(driver.findElement(By.id("graphics")).isEnabled());
System.out.println(driver.findElement(By.id("graphics")).isSelected());
driver.findElement(By.id("graphics")).click();
System.out.println(driver.findElement(By.id("graphics")).isSelected());
driver.findElement(By.id("graphics")).click();
System.out.println(driver.findElement(By.id("graphics")).isSelected());






	}

}
