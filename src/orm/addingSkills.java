package orm;

import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class addingSkills {
	
			static WebDriver driver = driversetup.driver;
			static Properties prop = getVal.fetchProp("C:\\Users\\Aman\\eclipse-workspace\\MP2\\MP\\MP\\resources\\config.properties");

//			static String skill = gettingValues.skill;
	
			// selecting the skills section
			public static void skills() throws InterruptedException {
				WebElement skill = driver.findElement(By.xpath("//a[text()='Skills']"));
				highlight.highLightElement(skill);
				skill.click();
				
				Thread.sleep(2500);
			}
				
			// clicking the add button
			public static void add() throws InterruptedException {
				WebElement add = driver.findElement(By.xpath("//button[text()=' Add ']"));
				highlight.highLightElement(add);
				add.click();
				
				Thread.sleep(2500);
			}
			
			// typing into the input box 	
			public static void input() throws InterruptedException, FileNotFoundException {
				WebElement inputtext = driver.findElement(By.xpath("//div[@class='oxd-input-group__label-wrapper']/following-sibling::div/input"));
				highlight.highLightElement(inputtext);
				//inputtext.sendKeys("Testing Demo");
				inputtext.sendKeys(prop.getProperty("skill"));
				Thread.sleep(2500);
			}
			
//			// checking if the element is already present
//			
//			public static void checking_skill() {
//				WebElement checkSkill = driver.findElement(By.xpath("//*[text()='Already exists']"));
//				
//			}
			
			// clicking on the save button
			public static void save() throws InterruptedException {
				WebElement save= driver.findElement(By.xpath("//button[text()=' Save ']"));
				highlight.highLightElement(save);
				save.click();
				
				
				
//				String alertbox = driver.switchTo().alert().getText();
//				System.out.println(alertbox);
				
				Thread.sleep(2500);
				
			}
			

}
