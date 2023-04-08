import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAssert {

	WebDriver driver;
	@BeforeTest
	public void setUP() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
	}
	
	@Test
	public void googleTitleTest() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "Google1234","Title Not Match");
	}
	
	@Test
	public void gmailLinkTest() {
		boolean b = driver.findElement(By.xpath("//a[text()='Gmail']")).isDisplayed();
		Assert.assertTrue(b,"Gmail Link Not Displayed");
	}
	
	@AfterTest
	public void logOut() {
		driver.close();
	} 
}
