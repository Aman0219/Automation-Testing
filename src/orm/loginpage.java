package orm;

import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginpage {
	
	static WebDriver driver = driversetup.driver;
//	
	static Properties prop = getVal.fetchProp("C:\\Users\\Aman\\eclipse-workspace\\MP2\\MP\\MP\\resources\\config.properties");
//	
	
	// creating a method for the username- automation
	public static void username() throws InterruptedException, FileNotFoundException {
		
		
		
		
		WebElement username = driver.findElement(By.name("username"));
		highlight.highLightElement(username);
		//username.sendKeys("Admin");
		
		username.sendKeys(prop.getProperty("username"));
		Thread.sleep(2000);
		
		
	}
	
	public static void password() throws InterruptedException, FileNotFoundException {
		WebElement password = driver.findElement(By.name("password"));
		highlight.highLightElement(password);
		//password.sendKeys("admin123");
		password.sendKeys(prop.getProperty("password"));
		
		Thread.sleep(2000);
	}
	
	public static void loginbutton() throws InterruptedException {
		WebElement login_button = driver.findElement(By.tagName("button"));
		highlight.highLightElement(login_button);
		login_button.click();
		
		Thread.sleep(2000);
		
	}
	
	

}
