package selenium;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseRailway {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
driver.findElement(By.xpath(".//*[@id='usernameId']")).sendKeys("gcreddy7");
driver.findElement(By.className("loginPassword")).sendKeys("gld938");
Scanner scan = new Scanner(System.in);
System.out.println("enter the captcha");
String captcha =scan.nextLine();
driver.findElement(By.className("loginCaptcha")).sendKeys(captcha);
driver.findElement(By.id("loginbutton")).click();
String url=driver.getCurrentUrl();
if(url.equals("https://www.irctc.co.in/eticketing/home")){
System.out.println("Login Passed");
}
else{
System.out.println("Login failed");	
	
}
}
	}


