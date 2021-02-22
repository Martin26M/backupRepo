package Assignement2.Assignement2;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPageTest extends Base {

	LoginPage lp;

	
	public LoginPageTest() throws IOException {
		super();
		
	}

	@BeforeTest
	
	public void SetUp() throws IOException {
		
		Initialize();
		lp= new LoginPage();
	}
	
	@Test
	public void LoginClick() {
		
		lp.Login(System.getProperty("UserName"), System.getProperty("Password"));
	}
	
	
}
