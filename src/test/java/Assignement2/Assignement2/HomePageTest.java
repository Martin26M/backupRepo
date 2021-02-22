package Assignement2.Assignement2;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageTest extends Base {

	
	LoginPage lp;
	HomePage hm;
	
	public HomePageTest() throws IOException {
		super();
		
	}
	
  @BeforeTest
	
	public void SetUp() throws IOException {
		
	    Initialize();
		lp= new LoginPage();
		hm= new HomePage();
	}
	
	@Test
	public void LoginClick() {
		
		lp.Login(prop.getProperty("UserName"), prop.getProperty("Password"));
		hm.addStatus();
	}
	
}
