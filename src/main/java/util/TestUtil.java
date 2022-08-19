package util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Assignement2.Assignement2.Base;

public class TestUtil extends Base{
	
	
	
	
	public TestUtil() throws IOException {
		super();
		
	}

	public static void takescreenshot(String MethodNAme) throws IOException {
		
	File  src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	FileUtils.copyFile(src, new File ("C:\\Users\\HP\\eclipse-workspace\\Assignement2\\Screenshot"+MethodNAme+".jpg"));
	
	
	}
}
