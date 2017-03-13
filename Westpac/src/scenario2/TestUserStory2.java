package scenario2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pom.WestpacHome_Object;
import utilities.utility1;

public class TestUserStory2 {
	
	WebDriver driver;
	@Test(priority=0)
	public void calculateRetAmt_test1() throws InterruptedException
	{
		driver=new FirefoxDriver();
		 utility1 u = new utility1();
		    String url = u.getInput("weburl");
		    u.openUrl(url, driver);
		    
		    WestpacHome_Object ob =  PageFactory.initElements(driver, WestpacHome_Object.class);
		    
		    ob.click(driver);
		    String age_string=u.getInput("age1");
		    int age=Integer	.parseInt(age_string);

		    String sal1=u.getInput("sal1");
		    int s1=Integer.parseInt(sal1);

	

		    ob.calculateAmt_test1(driver, age,s1);
		    System.out.println("userstory 2, acceptance criteria 1 validated successfully");
		    driver.quit();
	}
	
	@Test(priority=1)
	public void calculateRetAmt_test2() throws InterruptedException
	{
		driver=new FirefoxDriver();
		 utility1 u = new utility1();
		    String url = u.getInput("weburl");
		    u.openUrl(url, driver);
		    
		    WestpacHome_Object ob =  PageFactory.initElements(driver, WestpacHome_Object.class);
		    
		    ob.click(driver);
		    String age_string=u.getInput("age2");
		    int age=Integer	.parseInt(age_string);

		    String cur_bal=u.getInput("cur_bal");
		    int cbal=Integer	.parseInt(cur_bal);

		    
		    String sav_goal=u.getInput("sav_goal");
		    int sg=Integer.parseInt(sav_goal);

		    String vol_con=u.getInput("v_con2");
		    int vcon=Integer.parseInt(vol_con);
		    		
		    ob.calculateAmt_test2(driver, age,cbal,vcon, sg);
		    System.out.println("userstory 2, acceptance criteria 2 validated successfully");
		    driver.quit();
	}
	@Test(priority=2)
	public void calculateRetAmt_test3() throws InterruptedException
	{
		driver=new FirefoxDriver();
		 utility1 u = new utility1();
		    String url = u.getInput("weburl");
		    u.openUrl(url, driver);
		    
		    WestpacHome_Object ob =  PageFactory.initElements(driver, WestpacHome_Object.class);
		    
		    ob.click(driver);
		    String age_string=u.getInput("age3");
		    int age=Integer	.parseInt(age_string);

		    String cur_bal3=u.getInput("cur_bal3");
		    int cbal=Integer.parseInt(cur_bal3);
		   
		    String vol_con3=u.getInput("v_con3");
		    int vcon=Integer.parseInt(vol_con3);
		   
		    String sav_goal3=u.getInput("sav_goal3");
		    int sg=Integer.parseInt(sav_goal3);

		    ob.calculateAmt_test3(driver, age,cbal,vcon,sg);
		    System.out.println("userstory 2, acceptance criteria 3 validated successfully");
		    driver.quit();
	}
}
