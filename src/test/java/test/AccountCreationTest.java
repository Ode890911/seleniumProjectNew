//package test;
//
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.util.List;
//
//import org.openqa.selenium.Platform;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.remote.RemoteWebDriver;
//import org.testng.Assert;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//import pages.AuthenticationPage ;
//import utility.GlobalLibrary;
//
//
//public class AccountCreationTest {
//	
//		// TODO Auto-generated constructor stub
//
//
//
//
//
//
//	public String homePageUrl = "http://automationpractice.com/index.php";
//	String accountUrl = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
//	private WebDriver driver;
//	 AuthenticationPage nav = new AuthenticationPage();
//	
//
//	
//
//	@Test
//	public void accountCreation() throws MalformedURLException  {
//		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
//		desiredCapabilities.setBrowserName("chrome");
//		desiredCapabilities.setPlatform(Platform.WIN10);
//		
//		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.171:4445/wd/hub"),desiredCapabilities );
//	
//		//String title = nav.navigateToHomePage(homePageUrl);
////		System.out.println(title);
////		//Assert.assertEquals(title, "Login - My Store");
////		
////		
////	
////		     List<WebElement> socialMedialLinks =  nav.getSocialMediaIcons();
////		     System.out.println(socialMedialLinks.get(0));
////		   
////		  
////		     nav.clickSocialMediaLink("twitter");
////		     nav.swithToPage();
//		
//
////		String emailAdress = nav.newValidAccount();
////		String pageText = nav.elementDisplayedByText();
////		Assert.assertEquals(pageText, "AUTHENTICATION");
//
//	}
////	
//	
//}
