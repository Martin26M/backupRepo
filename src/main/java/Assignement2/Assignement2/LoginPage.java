package Assignement2.Assignement2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Base{
	
	
	LoginPage() throws IOException {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	WebElement email;
	
	@FindBy(id="pass")
	WebElement password;
	
	@FindBy(xpath="//button[@name='login']")
	WebElement loginbutton;
	
	
	public void Login(String text,String Password) {
		
		email.sendKeys(text);
		password.sendKeys(Password);
		loginbutton.click();
		
	}

}
