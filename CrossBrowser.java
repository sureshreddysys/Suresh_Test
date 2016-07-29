package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CrossBrowser {
	public static WebDriver driver;
	public static int browser;

	public static void main(String[] args) {
		for(browser=1;browser<=2;browser++){
			if(browser==1){
				System.setProperty("webdriver.ie.driver", "C:\\selenium eclipse\\IEDriverServer_x64_2.53.1\\chromedriver.exe");
				driver = new InternetExplorerDriver();	
			}
			else if(browser==2){

				System.setProperty("webdriver.chrome.driver", "C:\\selenium eclipse\\chromedriver_win32\\chromedriver.exe");
				driver = new ChromeDriver();
				
			}
			
		}
		
		
		
		
driver.get("https://www.google.com");
String page= driver.getTitle();
if(page.equals("Google")){
	System.out.println("Passed");
	
}
else {
	System.out.println("fail");
}
driver.close();
	}

}
