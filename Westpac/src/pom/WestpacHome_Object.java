package pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import utilities.utility1;

public class WestpacHome_Object {

	public WestpacHome_Object(WebDriver driver) {
		this.driver = driver;
	}

	WebDriver driver;

	@FindBy(how = How.ID, using = "ubermenu-section-link-kiwisaver-ps")
	WebElement Kiwisaver;

	@FindBy(how = How.ID, using = "ubermenu-item-cta-kiwisaver-calculators-ps")
	WebElement kiwicalc;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Click here to get started')]")
	WebElement clickstart;

	@FindBy(how = How.XPATH, using = ".//*[@id='widget']/div/div[1]/div/div[1]/div/div[1]/div/div/div/div[2]/div[1]/div[1]/div/div[1]/div/div[1]/div/div[contains(@class,'control-well')]")
	WebElement current_age;

	@FindBy(how = How.XPATH, using = "//*[@label='Current age']//div[contains(@class,'field-info-inner')]")
	WebElement current_age_info_icon;

	@FindBy(how = How.XPATH, using = "//*[@label='Current age']//div[contains(@class,'field-message')]/p")
	WebElement current_age_info;

	//age text area
	@FindBy(how=How.XPATH, using=".//*[@id='widget']/div/div[1]/div/div[1]/div/div[1]/div/div/div/div[2]/div[1]/div[1]/div/div[1]/div/div[1]/div/div/input")
	WebElement age;
	
	//employee status
	@FindBy(how=How.XPATH, using = ".//*[@id='widget']/div/div[1]/div/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div[1]/div/div/div/div[1]/div/span")
	WebElement estatus;
	
	@FindBy(how=How.XPATH, using =".//*[@id='widget']/div/div[1]/div/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div[1]/div/div/div/div[2]/ul/li[2]/div")
	WebElement selected;
	
	@FindBy(how=How.XPATH, using=".//*[@id='widget']/div/div[1]/div/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div[1]/div/div/div/div[2]/ul/li[3]/div/span")
	WebElement self_emp;
	
	
	//salary
	@FindBy(how=How.XPATH, using=".//*[@id='widget']/div/div[1]/div/div[1]/div/div[3]/div/div/div/div[2]/div[1]/div[1]/div/div/div[1]/div/div/input")
	WebElement sal1;
	
	//radio
	@FindBy(how=How.XPATH, using=".//*[@id='radio-option-069']")
	WebElement radio;
	
	//pir
	@FindBy(how=How.XPATH, using="//*[@id='widget']/div/div[1]/div/div[1]/div/div[5]/div/div/div/div[2]/div[1]/div[1]/div/div[1]/div/div/div[1]/div")
	WebElement pir;
	
	@FindBy(how=How.XPATH, using=".//*[@id='widget']/div/div[1]/div/div[1]/div/div[5]/div/div/div/div[2]/div[1]/div[1]/div/div[1]/div/div/div[2]/ul/div[2]/li/div")
	WebElement pir1;
	
	//  self employed
	@FindBy(how=How.XPATH, using=".//*[@id='widget']/div/div[1]/div/div[1]/div/div[3]/div/div/div/div[2]/div[1]/div[1]/div/div[1]/div/div/div[1]/div")
	WebElement pirselfemp;
	
	//emp status 3
	@FindBy(how=How.XPATH, using=".//*[@id='widget']/div/div[1]/div/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div[1]/div/div/div/div[1]/div/span")
	WebElement empnon;
	
	//emp status non emp
	@FindBy(how=How.XPATH, using = ".//*[@id='widget']/div/div[1]/div/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div[1]/div/div/div/div[2]/ul/li[4]/div/span")
	WebElement empnonemp;
			
	@FindBy(how=How.XPATH, using=".//*[@id='widget']/div/div[1]/div/div[1]/div/div[3]/div/div/div/div[2]/div[1]/div[1]/div/div[1]/div/div/div[2]/ul/div[3]/li/div/span")
	WebElement pir2;
	
	//pir3
	@FindBy(how=How.XPATH, using=".//*[@id='widget']/div/div[1]/div/div[1]/div/div[3]/div/div/div/div[2]/div[1]/div[1]/div/div[1]/div/div/div[1]/div")
	WebElement pir3;
	
	//pir not employed
	@FindBy(how=How.XPATH, using=".//*[@id='widget']/div/div[1]/div/div[1]/div/div[3]/div/div/div/div[2]/div[1]/div[1]/div/div[1]/div/div/div[2]/ul/div[3]/li/div/span")
	WebElement pirnotemp;
	
	//pir main 3
	@FindBy(how=How.XPATH, using=".//*[@id='widget']/div/div[1]/div/div[1]/div/div[3]/div/div/div/div[2]/div[1]/div[1]/div/div[1]/div/div/div[1]/div/span")
	WebElement pirmain3;
	
	//pir 3 selected
	@FindBy(how=How.XPATH, using=".//*[@id='widget']/div/div[1]/div/div[1]/div/div[3]/div/div/div/div[2]/div[1]/div[1]/div/div[1]/div/div/div[2]/ul/div[3]/li/div/span")
	WebElement pir3selected;
	
	//current Key Saver Balance
	@FindBy(how=How.XPATH, using=".//*[@id='widget']/div/div[1]/div/div[1]/div/div[5]/div/div/div/div[2]/div[1]/div[1]/div/div/div[1]/div/div/input") 
	WebElement cur_key_saver_bal;
	
	//Voluntary contribution
	
	@FindBy(how=How.XPATH, using=".//*[@id='widget']/div/div[1]/div/div[1]/div/div[5]/div/div/div/div[2]/div[1]/div[1]/div/div/div[1]/div/div/input")
	WebElement vol_cont;
	
	@FindBy(how=How.XPATH, using=".//*[@id='widget']/div/div[1]/div/div[1]/div/div[6]/div/div/div/div[2]/div[1]/div[1]/div/div/div[1]/div[1]/div/input")
	WebElement vol_cont3;
	
	//highrisk
	@FindBy(how=How.XPATH, using=".//*[@id='radio-option-021']")
	WebElement riskh;
	
	//medium rish
	@FindBy(how=How.XPATH, using=".//*[@id='radio-option-01Y']")
	WebElement riskm;

	
	//saving goal at retirment
	@FindBy(how=How.XPATH, using =".//*[@id='widget']/div/div[1]/div/div[1]/div/div[8]/div/div/div/div[2]/div[1]/div[1]/div/div/div[1]/div/div/input")
	WebElement saving_goal;
	
	//submit
	@FindBy(how=How.XPATH, using=".//*[@id='widget']/div/div[1]/div/div[2]/button")
	WebElement sub;
	
	public WebDriver click(WebDriver driver) throws InterruptedException {
		
		Actions a = new Actions(driver);
		a.moveToElement(Kiwisaver).moveToElement(kiwicalc).click().build().perform();
		Thread.sleep(7000);
		clickstart.click();
		Thread.sleep(20000);
		return driver;
	}
	
	public WebDriver validate(WebDriver driver) throws InterruptedException
	{
		//driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		Thread.sleep(15000);
		if (current_age.isDisplayed()) {
			if (current_age_info_icon.isDisplayed()) {
				current_age_info_icon.click();
				Thread.sleep(1000);

				String actual_info_details = current_age_info.getText();
				utility1 u = new utility1();
				String expected_info_details = u.getInput("exp_current_age_msg");
				Assert.assertEquals(actual_info_details, expected_info_details);
				System.out.println("validated successfully");
			}
		}

		return driver;
	}
	
	public WebDriver calculateAmt_test1(WebDriver driver, int a, int sal)
	{
	    driver.switchTo().frame(2);
	    age.sendKeys(Integer.toString(a));
	    estatus.click();
	    selected.click();
	    sal1.sendKeys(Integer.toString(sal));
	    radio.click();
	    pir.click();
	    pir1.click();
	    riskh.click();
	    sub.click();
	    
	    return driver;
	}
	public WebDriver calculateAmt_test2(WebDriver driver, int a, int cur_bal, int vcon, int sav_goal)
	{
	    driver.switchTo().frame(2);
	    age.sendKeys(Integer.toString(a));
	    estatus.click();
	    self_emp.click();
	    pirselfemp.click();
	    pir2.click();
	    //System.out.println("selected");
	    cur_key_saver_bal.sendKeys(Integer.toString(cur_bal));
	    vol_cont.sendKeys(Integer.toString(vcon));
	    riskm.click();
	    saving_goal.sendKeys(Integer.toString(sav_goal));
	    
	    sub.click();
	    
	    return driver;
	}

	public WebDriver calculateAmt_test3(WebDriver driver, int a, int cur_bal,int vcon3, int sav_goal3)
	{
	    driver.switchTo().frame(2);
	    age.sendKeys(Integer.toString(a));
	    empnon.click();
	    empnonemp.click();
	    pirmain3.click();
	    pir3selected.click();
	    cur_key_saver_bal.sendKeys(Integer.toString(cur_bal));
	    vol_cont3.sendKeys(Integer.toString(vcon3));
	    
	    riskm.click();
	    saving_goal.sendKeys(Integer.toString(sav_goal3));
	    sub.click();
	    
	    return driver;
	}


}
