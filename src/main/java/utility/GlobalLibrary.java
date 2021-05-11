package utility;


import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GlobalLibrary {
	
	private WebDriver driver;

	
	public GlobalLibrary(WebDriver _driver){
		driver= _driver;
		
	}
	
	
	
	public RemoteWebDriver startRemoteDriver( ){
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setBrowserName("chrome");
		desiredCapabilities.setPlatform(Platform.WIN10);
		
		RemoteWebDriver driver = null;
		try {
			driver = new RemoteWebDriver(new URL("http://192.168.1.171:4445/wd/hub"),desiredCapabilities );
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return driver;
		
		
	
		
	}
	

//	public WebElement fluentWait(By by) {
//		WebElement targetElem = null;
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		targetElem = wait.until(new Function<WebDriver, WebElement>() {
//			public WebElement apply(WebDriver driver) {
//				return driver.findElement(by);
//			}
//		});
//		return targetElem;
//		
//	}
	
	public WebDriverWait waitUntil() {
	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
		return wait;
	}

	
	


}
