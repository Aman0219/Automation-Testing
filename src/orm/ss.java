package orm;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ss {
	
	static WebDriver driver = driversetup.driver;
	
	public static void Screenshot(String name) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		File destinationFile = new File("C:\\Users\\Aman\\eclipse-workspace\\MP2\\MP\\MP\\screenshots\\"+ name +".png");
		FileHandler.copy(sourceFile, destinationFile);
	}

}
