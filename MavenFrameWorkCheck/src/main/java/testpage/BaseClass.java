package testpage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	public static WebDriver driver;
	protected WebDriverWait waiting;
	protected LoginPage login;
	protected LogoutPage logout;
	protected ChromeOptions options;
	
    public void waitFor(int seconds) {
    	waiting = new WebDriverWait(driver, 30);
    	waiting.withTimeout(seconds, TimeUnit.SECONDS);
    }
}
