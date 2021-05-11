//package pages;
//
//import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;
//
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.time.Duration;
//import java.util.List;
//import java.util.Set;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.Platform;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.remote.RemoteWebDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.BeforeMethod;
//
//
//
//import utility.GlobalLibrary;
//
//
//
//
//public class AuthenticationPage{
//	
//	public static WebDriver driver;
//
//
//
//
//	//public static GlobalLibrary myLib;
//	
////		@BeforeMethod
////	public void beforeEachTestStart() throws Exception {
////	
////			driver = myLib.startRemoteDriver();
////			
////	}
////	
//
//	
//	
//	//RemoteWebDriver driver = myLib.startRemoteDriver();
//	//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	public String navigateToHomePage(String appUrl) throws MalformedURLException {
//		
//	
//		driver.manage().window().maximize();
//		driver.get(appUrl);
//		String title = driver.getTitle();
//		return title;
//	}
//
//	
//	
//	public void newInvalidAccount() {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(presenceOfElementLocated(By.id("email_create"))).sendKeys("abc", Keys.TAB);
//	driver.findElement(By.cssSelector("#email_create")).sendKeys("abc", Keys.TAB);
//	      driver.findElement(By.id("SubmitCreate")).click();
//		
//	}
//
//	public String createAccountError() {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(presenceOfElementLocated(By.cssSelector("#create_account_error > ol > li")));
//	      String msg = driver.findElement(By.cssSelector("#create_account_error > ol > li")).getText();
//	      return msg;
//		
//	}
//
//
//
//	public String newValidAccount() {
//		
//	      String emailAdress = "marie@g.com";
//	      driver.findElement(By.cssSelector("#email_create")).sendKeys(emailAdress, Keys.TAB);
//	     driver.findElement(By.id("SubmitCreate")).click();
//	      return emailAdress;
//		
//	}
//	
//	
//
//
////	private int timeStamp() {
////		Date date = new Date();
////	    date.getYear()
////	      int month = `${date.getMonth() + 1}`.padStart(2, '0');
////	      const day = `${date.getDate() + 1}`.padStart(2, '0');
////	      const hour = `${date.getHours() + 1}`.padStart(2, '0');
////	      const min = `${date.getMinutes() + 1}`.padStart(2, '0');
////	      const sec = `${date.getSeconds() + 1}`.padStart(2, '0');
////	      return `${year}${month}${day}${hour}${min}${sec}`;
////		return 0;
////	}
//
//
//
//	public String elementDisplayedByText() {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(presenceOfElementLocated(By.cssSelector("h1.page-heading")));
//	      String textDisplayed = driver.findElement(By.cssSelector("h1.page-heading")).getText();
//	      return textDisplayed;
//	}
//
//
//
//	public void tearDown() {
//		   driver.quit();
//		
//	}
//
//
//
//	public List<WebElement> getSocialMediaIcons() {
//		 List<WebElement> socialMediaLinks =  driver.findElements(By.cssSelector("#social_block > ul > li>a>span"));
//		return socialMediaLinks;
//	}
//
//
//
//	public void clickSocialMediaLink(String socialLink) {
//		driver.findElement(By.cssSelector("#social_block > ul > li."+socialLink+"")).click();
//		
//	}
//
//
//
//	public void swithToPage() {
//		 Set<String> windows = driver.getWindowHandles();
//	    System.out.println(windows);
//	     //  await this.driver.switchTo().window(2)
//	      String title =  driver.getTitle();
//	    System.out.println(title);
//		
//	}
//	
////	private RemoteWebDriver startRemoteDriver() throws MalformedURLException {
////		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
////		desiredCapabilities.setBrowserName("chrome");
////		desiredCapabilities.setPlatform(Platform.WIN10);
////		
////		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.171:4445/wd/hub"),desiredCapabilities );
////	
////		return driver;
////		
////		
////	
////		
////	}
//
//
//
//	
//
//	
//	
//
//}
