package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkoutpage {
	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"first-name\"]") WebElement firstname;
	@FindBy(xpath = "//*[@id=\"last-name\"]") WebElement lastname;
	@FindBy(xpath = "//*[@id=\"postal-code\"]") WebElement postalcode;
	@FindBy(xpath = "//*[@id=\"continue\"]") WebElement continuebtn;
	
	public Checkoutpage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void checkoutpagemthd(String fn, String ln, String zip)
	{
		firstname.sendKeys(fn);
		lastname.sendKeys(ln);
		postalcode.sendKeys(zip);
		continuebtn.click();
		
	}
	
	

}
