package selenium;

public class AdminLoginVaild extends Method1{

	public static void main(String[] args) {
		AdminLoginVaild obj1=new AdminLoginVaild();
		obj1.launchBrowser();
		obj1.adminLogin();
		String Url=driver.getCurrentUrl();
		if(Url.contains("http://www.gcrit.com/build3/admin/index.php?osCAdminID=ruah73lqreqvo9ikpmtmfa56i7&osCAdminID=ruah73lqreqvo9ikpmtmfa56i7")){
			System.out.println("passed");
		}
		else{
			System.out.println("failed");
		}
obj1.closeBrowser();
	
	}

}
