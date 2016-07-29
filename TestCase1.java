package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Selenium_(software)");
		driver.findElement(By.linkText("Create account")).click();
		String Url =driver.getCurrentUrl();
		//System.out.println(Url);
		if(Url.contains("wikipedia.org")){
			System.out.println("This is an internal Link");
			
		}
		else{
			System.out.println("This is an external Link");
		}
driver.navigate().back();
driver.findElement(By.partialLinkText("seleniumhq.org")).click();
String Url1 =driver.getCurrentUrl();
//System.out.println(Url);
if(!Url1.contains("wikipedia.org")){
	System.out.println("This is an External Link");
	
}
else{
	System.out.println("This is an Internal Link");
}
	}

}
