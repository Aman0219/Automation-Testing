package orm;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;



public class driversetup {
	
	public static WebDriver driver;
	// setting up the driver class
	public static WebDriver launch() {
		
		System.out.println("Select the browser as per the choice :");
		System.out.println("Select 1 for Chrome \n Select 2 for Edge \n Select 0 for exit");
		
		Scanner sc= new Scanner(System.in);
		
		int n = sc.nextInt();
		
		// if the chrome choice is selected 
		if(n==1) {
			
			
			 driver = new ChromeDriver();
			
			System.setProperty("webdriver.chrome.driver", 
					"\\mini_project\\Drivers\\chromedriver.exe");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
			// if not use implicit wait then there will be an error like element not found
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			
			
			
		}
		
		// if the edge browser is selected
		else if(n==2) {
			
			driver = new EdgeDriver();
			
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\Aman\\eclipse-workspace\\MP2\\MP\\MP\\Drivers\\msedgedriver.exe");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
			// if not use implicit wait then there will be an error like element not found
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			
		}
		// if the option 0 is selected for exit.
		else if(n==0) {
			System.out.println("You selected to exit. \n Thank You");
			driver.quit();
			
		}
		
		// if none of the options provided is selected.
		else {
			System.out.println("Wrong input given. \n Please choose the correct option.");
			driver.quit();
		}
		
		return driver;
		
	}
	
	
	

}
