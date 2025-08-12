package utils;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



public class Screenshotutil {
	
	public void captureScreenshot(WebDriver driver,String destinationpath) throws Exception
	{
	
	File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File destination=new File(System.getProperty("user.dir")+"/screenshots/"+ destinationpath+".png");
	FileUtils.copyFile(srcfile,destination);

}
}