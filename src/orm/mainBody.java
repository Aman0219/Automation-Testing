package orm;

import java.io.IOException;
//import java.util.NoSuchElementException;
//import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;

public class mainBody {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		//WebDriver driver = driversetup.driver;
		
		
		driversetup.launch();
		
		
		
		loginpage.username();
		loginpage.password();
		loginpage.loginbutton();
		
		// taking screen shot when the user logs in
		ss.Screenshot("1");
		
		admin.adminpage();
		admin.qualification();
		
		// taking screen shot when the user reach the qualification page
		ss.Screenshot("2");
		
		addingSkills.skills();
		

		addingSkills.add();
			
		addingSkills.input();
			
		skillAlready.checking_skill();
			
			if(skillAlready.val ==0) {
				addingSkills.save();
				
				System.out.println("Data added successfully");
				
				// taking ss when the new skill is added
				ss.Screenshot("3");
				
			}
			else {
				
				// taking screenshot if the skill is already present
				
				ss.Screenshot("already");
				
				skillAlready.cancel();
			}
			
			
		deletingSkills.checkbox();
		deletingSkills.delete();
		deletingSkills.confirmdelete();
		
		// taking ss when the skill is deleted
		ss.Screenshot("4");
		
		logoutpage.profile();
		logoutpage.logout();
		
		// taking ss when the user logs out 
		ss.Screenshot("5");
		
		driversetup.driver.quit();
		
		
	}

}
