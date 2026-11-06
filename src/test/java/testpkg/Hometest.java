package testpkg;

import org.testng.Assert;
import org.testng.annotations.Test;

import basepkg.Baseclass;

public class Hometest extends Baseclass {
	
	@Test(priority =1)
	public void textverify()
	{
//		loginobj.loginmethod("standard_user", "secret_sauce");// calls the login method before executing homepage method
		homeobj.textmthd();
		String productText = homeobj.textmthd();
		Assert.assertEquals(productText, "Products");
	}
	
	@Test(priority =2)
	public void linkverify()
	{
		int linkcount = homeobj.linkmthd();
		System.out.println("Number of links ----"+linkcount);
	}
	@Test(priority =3)
	public void cartmthd()
	{
		homeobj.cartmthd();
		
	}
	
	

}
