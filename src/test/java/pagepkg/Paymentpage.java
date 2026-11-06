package pagepkg;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Paymentpage {
	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"finish\"]") WebElement finishbtn;
	
	
	public Paymentpage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
		
	public void screenshotmthd() throws Exception
	{
		File s =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(s,new File("C:\\Users\\AKHIL PADMANABHAN\\OneDrive\\Desktop\\SELENIUM WORKS\\SCREENSHOTS\\Payment.png"));
		WebElement payment = driver.findElement(By.xpath("//*[@id=\"contents_wrapper\"]"));
		File s1=payment.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(s1, new File ("./Screenshots/paymentscreenshot.png"));
		
	}
	
	public void payamentmthd()
	{
		finishbtn.click();
	}
	
	

}
