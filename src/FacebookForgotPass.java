import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookForgotPass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Forgotten password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("identify_email")).sendKeys("8928304923");
		Thread.sleep(2000);
		driver.findElement(By.id("did_submit")).click();
		driver.close();
		

	}
}
