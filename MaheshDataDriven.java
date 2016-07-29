package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import jxl.read.biff.File;

public class MaheshDataDriven {
	@Test(priority=1)
	public void Facebook(){
		System.setProperty("webdriver.chrome.driver", "C:\\selenium eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("gunreddysureshreddy");
		driver.findElement(By.id("pass")).sendKeys("Sairam@11");
		driver.findElement(By.id("loginbutton")).click();
	driver.close();
	}
	
	public void ReadExcelSheet()
	{
		File F=new File
		
	}

}
