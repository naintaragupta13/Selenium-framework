package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	}
	

	
	By username= By.name("username");
	By password= By.name("password");
	By button= By.tagName("button");
	
	
	public void enterusername(String name) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(username));
		driver.findElement(username).sendKeys(name);
		
	}
	
	
public void enterpassword(String passwd) {
	driver.findElement(password).sendKeys(passwd);
	wait.until(ExpectedConditions.visibilityOfElementLocated(password));
	}

public void clicklogin() 
	
{
	driver.findElement(button).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(button));
}
	
}
