//package test;
//
//import org.testng.annotations.Test;
//
//import pages.AuthenticationPage;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.AfterTest;
//
//public class AccountCreationTestTest {
//	AuthenticationPage nav = new AuthenticationPage();
//	String homePageUrl = "http://automationpractice.com/index.php";
//	String accountUrl = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
//
//	@BeforeMethod
//	public void beforeMethod() {
//
//	}
//
//	@AfterMethod
//	public void afterMethod() {
//	}
//
//	@BeforeClass
//	public void beforeClass() {
//
//	}
//
//	@AfterClass
//	public void afterClass() {
//	}
//
//	@BeforeTest
//	public void beforeTest() {
//	}
//
//	@AfterTest
//	public void afterTest() {
//	}
//	@Test (description = "Navigation to authentication page", priority = 0)
//	public void navigateToHomePageTest() {
//		String title = nav.navigateToHomePage(accountUrl);
//		System.out.println(title);
//		Assert.assertEquals(title, "Login - My Store");
//	}
//
//	@Test(description = "create a new account with correct email format", priority = 1 )
//	public void accountCreationTest() {
//		String emailAdress = nav.newValidAccount();
//		String pageText = nav.elementDisplayedByText();
//		Assert.assertEquals(pageText, "AUTHENTICATION");
//
//	}
//
//	
//}
