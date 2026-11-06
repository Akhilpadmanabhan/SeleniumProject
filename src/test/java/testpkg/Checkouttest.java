package testpkg;

import org.testng.annotations.Test;

import basepkg.Baseclass;

public class Checkouttest extends Baseclass {
	@Test(priority = 1)
    public void carttestmethod()
    {
        checkoutobj.checkoutpagemthd("Akhil","Padmanabhan","670307");
       
    }
	
}
