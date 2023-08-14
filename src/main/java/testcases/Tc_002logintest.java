package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.HomePage;
import pageobjects.Loginpage;
import pageobjects.Myaccountpage;
import testbase.Baseclass;

public class Tc_002logintest extends Baseclass {
	@Test
	public void testloginsetup() {
		
		logger.info("********starting login page******");
		try{
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		hp.loginlnk();
		
		Loginpage lp=new Loginpage(driver);
		
		lp.setemail(rb.getString("email"));
		lp.setpassword(rb.getString("pwd"));
		lp.loginbtn();
		
		Myaccountpage mac=new Myaccountpage(driver);
		mac.myaccountpageexists();
		boolean targetpage=mac.myaccountpageexists();
		Assert.assertEquals(targetpage,true);
	}
	catch(Exception e)
	{
		
		Assert.fail();
		logger.info("************ suscces**********");
	}

	}}
