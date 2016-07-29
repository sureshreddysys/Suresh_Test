package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Selenium5 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// open url
		driver.get("http://www.newtours.demoaut.com");
		/*String window= driver.getWindowHandle();
		System.out.println(window);
		driver.navigate().to("https://www.google.com");
		driver.manage().window().maximize();
*/
		//capure text message
		driver.get("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#identifier");
		String a= driver.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/h2")).getText();
		System.out.println(a);
		
		//capure error message
		
driver.findElement(By.xpath(".//*[@id='next']")).click();
String b= driver.findElement(By.xpath(".//*[@id='errormsg_0_Email']")).getText();
System.out.println(b);
		
}}
