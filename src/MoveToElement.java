import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		WebElement ele = driver.findElement(By.xpath("//a[text()='Women']"));
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Dresses']")).click();
		driver.close();
		
		
	}

}
