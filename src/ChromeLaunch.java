import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunch {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("UserName");
		driver.findElement(By.id("pass")).sendKeys("Password");
		driver.findElement(By.name("LOGIN")).click();
		
		
		
	}
}
