package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Basepage
{public HomePage(WebDriver driver) {
	super(driver);
}

// Elements
@FindBy(xpath = "//span[text()='My Account']")
WebElement lnkMyaccount;

@FindBy(linkText = "Register")
WebElement lnkRegister;

@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")
WebElement loginlnk;

// Action Methods
public void clickMyAccount() {
	lnkMyaccount.click();
}

public void clickRegister() {
	lnkRegister.click();
}

public void loginlnk() {
	loginlnk.click();
}

}


