import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SkillaryLogin {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://demoapp.skillrary.com/");
		driver.findElement(By.linkText("LOGIN")).click();
		driver.findElement(By.id("email")).sendKeys("User");
		driver.findElement(By.id("password")).sendKeys("User");
		driver.findElement(By.id("last")).click();
		
		

	}
}
