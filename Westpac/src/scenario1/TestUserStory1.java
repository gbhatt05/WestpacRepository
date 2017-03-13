package scenario1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pom.WestpacHome_Object;
import utilities.utility1;

public class TestUserStory1 {

	WebDriver driver = new FirefoxDriver();
	
	@Test
	public void informationIcon() throws InterruptedException
	{	  
			
		    utility1 u = new utility1();
		    String url = u.getInput("weburl");
		    u.openUrl(url, driver);
		    
		    WestpacHome_Object ob =  PageFactory.initElements(driver, WestpacHome_Object.class);
		    ob.click(driver);
		    ob.validate(driver);
		    System.out.println("userstory 1, acceptance criteria validated successfully");
		    driver.quit();
	}
	
}
