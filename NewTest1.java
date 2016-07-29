package selenium;

import org.testng.annotations.Test;

public class NewTest1 {
  @Test(groups={"sanity", "regression"}, priority=1)
  public void login(){
	  System.out.println("login successfull");
	  
  }
  @Test(groups={"sanity"},priority=3)
  public void fundTransfer(){
	  System.out.println("Fund Transfer successfull");
	  
  }
  @Test(groups={"sanity"},priority=3)
  public void search(){
	  System.out.println("search successfull");
	  
  }
  @Test(groups={"regression"},priority=2)
  public void advSearch(){
	  System.out.println("advsearch successfull");
	  
  }
  @Test(groups={ "regression"},priority=4)
  public void prepayecharge(){
	  System.out.println("Recharge successfull");
	  
  }
  @Test(groups={"regression"},priority=3)
  public void billPayment(){
	  System.out.println("Bill Payment successfull");
	  
  }
  @Test(groups={"sanity","regression"},priority=10)
  public void logout(){
	  System.out.println("logout successfull");
	  
  }
}
