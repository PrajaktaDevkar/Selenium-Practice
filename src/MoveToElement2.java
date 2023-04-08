import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Orders']")).click();
		driver.close();
		

	}
}
