package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.AccountRegistrationPage;
import pageobjects.HomePage;
import testbase.Baseclass;

public class TC_001_AccountRegistrationTest extends Baseclass{
	@Test
	public void test_account_Registration() throws InterruptedException
	{
		logger.info("***  Starting TC_001_AccountRegistrationTest ***");
		try
		{
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		hp.clickRegister();
		
		AccountRegistrationPage regpage=new AccountRegistrationPage(driver);
		
		regpage.setFirstName(randomeString().toUpperCase());
		
		regpage.setLastName(randomeString().toUpperCase());
		
	//	regpage.setEmail(randomeString()+"@gmail.com");// randomly generated the email
		
		regpage.setTelephone(randomeNumber());
		
		String password=randomAlphaNumeric();
		regpage.setPassword(password);
		regpage.setConfirmPassword(password);
		
		regpage.setPrivacyPolicy();
		
		regpage.clickContinue();
		
		String confmsg=regpage.getConfirmationMsg();
		
		Assert.assertEquals(confmsg, "Your Account Has Been Created!");
		}
		catch(Exception e)
		{
			Assert.fail();
		}
	}
	
	
}
