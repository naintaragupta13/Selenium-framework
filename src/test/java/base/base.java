package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class base {
	
	public WebDriver driver;
	public ExtentReports extent;
	public ExtentTest Test;
	
	
	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	
	public void SetupReport()
	{
		ExtentSparkReporter spark=new ExtentSparkReporter(System.getProperty("user.dir")+"/Reports/report.html");
		
	
	
	 spark.config().setReportName("Login test");
	 spark.config().setDocumentTitle("Automation Test");
	 spark.config().setTheme(Theme.STANDARD);
	 
	 extent=new ExtentReports();
	 extent.attachReporter(spark);
	 }
		
  public void flushreport() 
  {
	  extent.flush();
  }
			 
			 
	 
	}

