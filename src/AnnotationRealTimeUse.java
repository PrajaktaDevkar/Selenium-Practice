import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationRealTimeUse {

	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		System.out.println("ChromeDriver Proprty set");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
	}

	@Test(priority=1,groups="Title")
	public void googleTitle() {
		System.out.println("Title: "+driver.getTitle());	
	}
	
	@Test(priority=2,groups="LOGO")
	public void googleLogTest() {
		boolean out = driver.findElement(By.xpath("//a[@class='gb_A']")).isDisplayed();
	}
	
	@Test(priority=3,groups="GMail")
	public void mailLinkTest() {
		boolean gmail = driver.findElement(By.xpath("//a[text()='Gmail']")).isDisplayed();
	}
	
	@Test(priority=4,groups="Test")
	public void test1() {
		System.out.println("test1");
	}
	
	@Test(priority=5,groups="Test")
	public void test2() {
		System.out.println("test2");
	}
	
	@Test(priority=6,groups="Test")
	public void test3() {
		System.out.println("test3");
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
}
