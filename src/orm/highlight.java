package orm;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class highlight {
	
	public static void highLightElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driversetup.driver;   
		   js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');", element);   
		 
	}

}
