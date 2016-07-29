package selenium;

import org.openqa.selenium.By;

public class AdminLoginVerify extends Method1 {

	public static void main(String[] args) {

AdminLoginVerify obj2=new AdminLoginVerify();
obj2.launchBrowser();
obj2.adminLogin("admin", "admin@123");
driver.findElement(By.linkText("Online Catalog")).click();
String Url= driver.getCurrentUrl();
if(Url.equals("http://www.gcrit.com/build3/")){
	System.out.println("Redirected to user interface");
}
	else{
	System.out.println("fail");
		
	
	}
obj2.closeBrowser();
	}

	}
