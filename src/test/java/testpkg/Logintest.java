package testpkg;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import basepkg.Baseclass;

public class Logintest extends Baseclass{
	
		@Test(priority =1)
		public void titleverificationmthd()
		{
		String actualtitle = loginobj.titlemethod();
		Assert.assertEquals(actualtitle,"Swag Labs");
		}
		
		@Test(priority =2)
		public void loginvalidationmthd()
		{
			loginobj.loginmethod("standard_user", "secret_sauce");
			
		}
		
		@Test(priority =3)
		public void urlvalidation()
		{
			String homeurl =loginobj.urlmethd();
			System.out.println(homeurl);
//			Assert.assertEquals(homeurl, "https://www.saucedemo.com/inventory.html");
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.urlToBe("https://www.saucedemo.com/inventory.html"));
		}
	}


