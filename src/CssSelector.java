import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("User");
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("12345");
		driver.findElement(By.cssSelector("button[name='login']")).click();
		driver.close();

	}

}
