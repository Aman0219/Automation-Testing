package orm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class logoutpage {
	
	//static WebDriver driver = driversetup.driver;
	
	//for logout-profile
	
			public static void profile() throws InterruptedException {
				WebElement profile = driversetup.driver.findElement(By.className("oxd-userdropdown-img"));
				highlight.highLightElement(profile);
				profile.click();
				
				Thread.sleep(2500);
			}
				
			// logout button
			
			public static void logout() throws InterruptedException {
				WebElement logout = driversetup.driver.findElement(By.partialLinkText("Logout"));
				highlight.highLightElement(logout);
				logout.click();
				
				Thread.sleep(2500);
			}
				
	

}
