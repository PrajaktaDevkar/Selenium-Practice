import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotationIntro {

	@BeforeSuite
	public void setUP() {
		System.out.println("Setup system ptroperty for chrome");
	}
	
	@BeforeTest
	public void launchBrowser() {
		System.out.println("Launch Browser");
	}
	
	@BeforeClass
	public void login() {
		System.out.println("Login to app");
	}
	
	/*
	 *@BeforeMethod
	 *@Test -1
	 *@AfterMethod
	 *
	 *@BeforeMethod
	 *@Test -2
	 *@AfterMethod
	 * 
	 * 
	 * */
	
	
	@BeforeMethod
	public void enterUrl() {
		System.out.println("enter URL");
	}
	
	@Test
	public void googleTitleTest() {
		System.out.println("GoogleTitle Test");
	}
	
	@Test
	public void searchTest() {
		System.out.println("Search Test");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("Log out from App");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("close the Browser");
	}
	
	@AfterTest
	public void deleteAllCookies() {
		System.out.println("Delete All Cookies");
	}
	
	@AfterSuite
	public void aftersuite() {
		System.out.println("After Suite");
	}
	
	
}
