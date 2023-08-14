package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Myaccountpage extends Basepage{

	
	public Myaccountpage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//*[@id=\"content\"]/h2[1]")
	WebElement msghead;
	
	
	public boolean myaccountpageexists() {
		
		try
		{
			return(msghead.isDisplayed());
		}catch (Exception e) {
			return (false);
		}
		
		
	}
	
	
}
