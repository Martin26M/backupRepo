package Assignement2.Assignement2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends Base{
	
	HomePage() throws IOException {
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[@aria-label='Facebook']")
	WebElement facebooklogo;
	
	
	public void clickonLogo() {
		 WebDriverWait w= new WebDriverWait(driver, 100);
		 w.until(ExpectedConditions.elementToBeClickable(facebooklogo));
		facebooklogo.click();
		
	}
	
	
	public void addStatus() {
		
		WebDriverWait w1= new WebDriverWait(driver, 100);
		w1.until(ExpectedConditions.elementToBeClickable(By.xpath(" //div[@aria-label='Create a post'] //div[@class='oajrlxb2 b3i9ofy5 qu0x051f esr5mh6w e9989ue4 r7d6kgcz rq0escxv nhd2j8a9 j83agx80 p7hjln8o kvgmc6g5 cxmmr5t8 oygrvhab hcukyx3x cxgpxx05 d1544ag0 sj5x9vvc tw6a2znq i1ao9s8h esuyzwwr f1sip0of lzcic4wl l9j0dhe7 abiwlrkh p8dawk7l bp9cbjyn orhb3f3m czkt41v7 fmqxjp7s emzo65vh btwxx1t3 buofh1pr idiwt2bm jifvfom9 ni8dbmo4 stjgntxs kbf60n1y']")));
		driver.findElement(By.xpath(" //div[@aria-label='Create a post'] //div[@class='oajrlxb2 b3i9ofy5 qu0x051f esr5mh6w e9989ue4 r7d6kgcz rq0escxv nhd2j8a9 j83agx80 p7hjln8o kvgmc6g5 cxmmr5t8 oygrvhab hcukyx3x cxgpxx05 d1544ag0 sj5x9vvc tw6a2znq i1ao9s8h esuyzwwr f1sip0of lzcic4wl l9j0dhe7 abiwlrkh p8dawk7l bp9cbjyn orhb3f3m czkt41v7 fmqxjp7s emzo65vh btwxx1t3 buofh1pr idiwt2bm jifvfom9 ni8dbmo4 stjgntxs kbf60n1y']")).click();
	
	
		String s= driver.getWindowHandle();
		driver.switchTo().window(s);
		driver.findElement(By.xpath("//div[@class='rq0escxv buofh1pr df2bnetk hv4rvrfc dati1w0a l9j0dhe7 k4urcfbm du4w35lb gbhij3x4']")).sendKeys("Hello Martin");
	
	}
	
}