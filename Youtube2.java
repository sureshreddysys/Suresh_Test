import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube2 {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\selenium eclipse\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.google.com");
			String Title= driver.getTitle();
			System.out.println(Title);
			driver.navigate().to("https://www.yahoo.com");
			String URL= driver.getCurrentUrl();
			System.out.println(URL);
			driver.navigate().back();
			driver.navigate().forward();
			driver.navigate().refresh(); 
			driver.findElement(By.id("Email")).sendKeys("India");	
			driver.close();
			driver.quit();
			
			}

}
