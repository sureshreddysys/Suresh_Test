package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		/*if(driver.findElement(By.linkText("Gmail")).isDisplayed()){
			
		System.out.println("Gmail link exist");			
		}
		else{}
		System.out.println("Gmail not exist");
		
	}*/
		boolean existance= driver.findElement(By.linkText("yahoo")).isDisplayed();
		if(existance==true){
			
			System.out.println("Gmail exists");
			}
		}

}
