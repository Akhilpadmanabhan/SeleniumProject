package testpkg;

import org.testng.Assert;
import org.testng.annotations.Test;

import basepkg.Baseclass;

public class Carttest extends Baseclass {

	  @Test(priority =1)
	  public void cartsymbolmthd()
	  {
		  cartobj.cartsymbolmethod();
	  }
	  
	  @Test(priority =2)
	  public void verifytext()
	  {
		  cartobj.textmethod();
		  String yourcartText=cartobj.textmethod();
		  Assert.assertEquals(yourcartText, "Your Cart");
	  }
	  
	  @Test(priority =3)
	  public void checkoutmthd()
	  {
		  cartobj.checkoutmethod();
	  }
	
}
	
