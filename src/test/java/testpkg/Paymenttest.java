package testpkg;

import org.testng.annotations.Test;

import basepkg.Baseclass;

public class Paymenttest extends Baseclass {
	
        @Test(priority =1)
        public void paymentpagemthd() throws Exception
        {
        	paymentobj.screenshotmthd();
        	paymentobj.payamentmthd();
        }

}
