package orm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class admin {
	static WebDriver driver = driversetup.driver;
	
	// finding admin 
		public static void adminpage() throws InterruptedException {
			
			
			WebElement ad = driver.findElement(By.partialLinkText("Admin"));
			highlight.highLightElement(ad);
			ad.click();
			
			Thread.sleep(3000);
			
		}
	
			
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
			// finding qualifiaction page
		public static void qualification() throws InterruptedException {
			
			//WebElement quali = driver.findElement(By.linkText("Qualifications "));
			WebElement quali = driver.findElement(By.xpath("//span[text()='Qualifications ']"));
			highlight.highLightElement(quali);
			quali.click();
			
			Thread.sleep(2500);
			
		}
		
		
		
		

}
