package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"user-name\"]") WebElement username;
	@FindBy(xpath = "//*[@id=\"password\"]") WebElement password;
	@FindBy(xpath = "//*[@id=\"login-button\"]") WebElement loginbtn;
	
	public Loginpage(WebDriver driver) { //constructor
		
		 this.driver = driver;
		 PageFactory.initElements(driver,this);
	}
	//Methods
	public String titlemethod()
	{
		String title = driver.getTitle();
		return title;
	}
	
	public void loginmethod(String un, String pwd)
	{
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginbtn.click();
	}
	
	public String urlmethd()
	{
		String actualurl = driver.getCurrentUrl();
		return actualurl;
	}
	
	

}
