package orm;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class skillAlready {
	
	static WebDriver driver = driversetup.driver;
	static int val;
	
	// checking if the element is already present
	public static void checking_skill() {
		
		
		
			List<WebElement> checkSkill = driver.findElements(By.xpath("//*[text()='Already exists']"));
			 val = checkSkill.size();
			 
			 if(val>0) {
				 System.out.println("The skill to be added is already present");
			 }
			
			//System.out.println(val);

			 else {
				 System.out.println("The skill - Testing Demo is not present.");
			 }
		
		
		
		
	}
	
	
	// method to click on cancel button if skill is already present
	public static void cancel() throws InterruptedException {
		WebElement cancel_button = driver.findElement(By.xpath("//button[text()=' Cancel ']"));
		highlight.highLightElement(cancel_button);
		cancel_button.click();
		
		Thread.sleep(2500);
	}

}
