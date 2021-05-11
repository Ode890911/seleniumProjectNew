package test;

import java.net.MalformedURLException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GridTest {

	public String homePageUrl = "http://automationpractice.com/index.php";
	String accountUrl = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
	private WebDriver driver;
	//AuthenticationPage nav = new AuthenticationPage();

	@Test
	public void accountCreation() throws MalformedURLException {
		
//		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
//		desiredCapabilities.setBrowserName("chrome");
//		desiredCapabilities.setPlatform(Platform.ANY);
//
//		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.171:4455/wd/hub"), desiredCapabilities);
//		
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(homePageUrl);
		String title = driver.getTitle();

		System.out.println(title);
		Assert.assertEquals(title, "My Store");

		List<WebElement> socialMedialLinks = driver.findElements(By.cssSelector("#social_block > ul > li>a>span"));
		System.out.println(socialMedialLinks.get(0));

		// Print the first window name
		String originalWindow = driver.getWindowHandle();
		System.out.println(originalWindow);
		assert driver.getWindowHandles().size() == 1;
		driver.findElement(By.cssSelector("#social_block > ul > li.twitter")).click();

		// get all windows handle and store them into a Set
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows);

		// create an iterator object to loop through the set of window
		Iterator<String> it = windows.iterator();

		// Print the first window name
		System.out.println(it.next());
		// Print the second window name
		String secWind = it.next();
		System.out.println(secWind);

		// put the focus of the driver on the second window
		driver.switchTo().window(secWind);
		
		// get title of the second page
		String title2 = driver.getCurrentUrl();
		System.out.println(title2);

		// put the focus of the driver on the parent window
		driver.switchTo().window(originalWindow);
		String title3 = driver.getCurrentUrl();
		System.out.println(title3);
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

//		String emailAdress = nav.newValidAccount();
//		String pageText = nav.elementDisplayedByText();
//		Assert.assertEquals(pageText, "AUTHENTICATION");

	}

}
