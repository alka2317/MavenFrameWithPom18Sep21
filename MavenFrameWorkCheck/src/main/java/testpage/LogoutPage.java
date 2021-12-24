package testpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage extends BaseClass{

	WebDriver driver;
	@FindBy(id="welcome")
	private WebElement dropdown;
	
	@FindBy(xpath="//*[contains(text(),'Logout')]")
	private WebElement logout;
	
	@FindBy(id="welcome-menu")
	private WebElement dropdownCheck;
	
	public LogoutPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void logout() throws InterruptedException {
		dropdown.click();
		waitFor(10);
		Thread.sleep(5000);
		logout.click();
	}
}
