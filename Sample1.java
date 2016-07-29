package ExamplePackage;

import org.testng.annotations.Test;

public class Sample1 {
	@Test(priority=1)
	public void Login(){
		System.out.println("Login successfully");
	}
	@Test(enabled=false)
public void Diposit(){
	System.out.println("Money transfer Successfully");
	
}
	@Test(priority=3)
public void Transfer(){
	System.out.println("Transfer successfully");
}
}
