package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage extends Basepage{
	
	public Loginpage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(name="email")
	WebElement  emailtxt;
	
	
	@FindBy(name="password")
	WebElement pwdtxt;
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div[2]/div/form/input")

	WebElement btn;
	
	public void setemail(String email) {
		
		emailtxt.sendKeys(email);
	}
	
	public void setpassword(String pwd) {
		
		pwdtxt.sendKeys(pwd);
		
	}
	public void loginbtn() {
		
		btn.click();
	}
	
	
	
	
	
	
	
}


