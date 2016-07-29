package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium3 {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\selenium eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// open url
		driver.get("http://www.newtours.demoaut.com");
		driver.findElement(By.name("userName")).sendKeys("mahesh");
		driver.findElement(By.name("password")).sendKeys("mahesh");
		Thread.sleep(4000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/input")).click();
		Thread.sleep(4000);
		boolean a=driver.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/input")).isSelected();
		
		Thread.sleep(4000);
		if(a== true){
			System.out.println("value is selected");
		}
		else{
			System.out.println("flase");
		}
		
		driver.close();
		
		
		
		
	}

}
