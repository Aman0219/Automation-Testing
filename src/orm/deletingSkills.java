package orm;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class deletingSkills {
	
	static WebDriver driver = driversetup.driver;
	
	// check box option for testing demo
			public static void checkbox() throws InterruptedException {
				
				
				
				WebElement check= driver.findElement(By.xpath("//*[text()='Testing Demo']/parent::div/preceding-sibling::div"));
				highlight.highLightElement(check);
				
				WebElement testdemo = driver.findElement(By.xpath("//*[text()='Testing Demo']"));
				
				JavascriptExecutor js = (JavascriptExecutor) driver;
				//js.executeScript("window.scrollBy(0,400)", "");
				
				js.executeScript("arguments[0].scrollIntoView();", testdemo);
				
				check.click();
				
				Thread.sleep(2500);
			}
			
			
			//deleting the testing demo skill
			public static void delete() throws InterruptedException {
				WebElement del= driver.findElement(By.xpath("//*[text()='Testing Demo']/parent::div/following-sibling::div[2]/child::div/child::button"));
				highlight.highLightElement(del);
				del.click();
				
				//Thread.sleep(10000);
				
//				String alertbox = driver.switchTo().alert().getText();
//				System.out.println(alertbox);
				Thread.sleep(2500);
			}
			
			//assuring it is permanently deleted
			
			public static void confirmdelete() throws InterruptedException {
				WebElement cnfrm = driver.findElement(By.xpath("//div[@class='orangehrm-modal-footer']/child::button[2]"));
				highlight.highLightElement(cnfrm);
				cnfrm.click();
				System.out.println("Data deleted successfully");
				
				Thread.sleep(2500);
			}
			

}
