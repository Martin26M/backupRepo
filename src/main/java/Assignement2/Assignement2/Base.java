package Assignement2.Assignement2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public static WebDriver driver;
	public static Properties prop ;
	
	public Base() throws IOException{
		
		prop= new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\data.properties");
		
		
		prop.load(fis);
	}
	
	public void Initialize() {
		
	String 	browsername = prop.getProperty("BrowserName");
		if (browsername.equalsIgnoreCase("Chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			driver.get(prop.getProperty("Url"));
			driver.manage().window().maximize();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
		}
		
	}

}
