package testclass;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import testpage.BaseClass;
import testpage.LoginPage;
import testpage.LogoutPage;

public class BaseTest extends BaseClass {
 

	@BeforeSuite
	public void initializingWebEnv() {
		WebDriverManager.chromedriver().setup();
		options = new ChromeOptions();
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@BeforeClass
	public void pageObjects() {
		login = new LoginPage(driver);
		logout = new LogoutPage(driver);
	}
	
	@AfterSuite
	public void tearDownEnv() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
}
