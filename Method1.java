package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method1 {
	public static WebDriver driver;
	public void launchBrowser(){
		System.setProperty("webdriver.chrome.driver", "C:\\selenium eclipse\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
	}

	public void adminLogin() {
		

		driver.get("http://www.gcrit.com/build3/admin/login.php?osCAdminID=ruah73lqreqvo9ikpmtmfa56i7");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin@123");
		driver.findElement(By.id("tdb1")).click();
	}

	public void adminLogin(String username, String password) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium eclipse\\chromedriver_win32\\chromedriver.exe");

		driver.get("http://www.gcrit.com/build3/admin/login.php?osCAdminID=ruah73lqreqvo9ikpmtmfa56i7");
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.id("tdb1")).click();
	}
	public void closeBrowser(){
		if(! driver.toString().contains("null")){
			driver.close();
		}
	}

	/*public static void main(String[] args) {
		
		Method1 obj = new Method1();
		obj.launchBrowser();
		obj.adminLogin();
		obj.closeBrowser();
		obj.launchBrowser();
		
		obj.adminLogin("admin", "admin@123");
		obj.closeBrowser();

	}*/
}
