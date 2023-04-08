import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CancelPOPUp {

public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		WebElement ele = driver.findElement(By.linkText("COURSE"));
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Cucumber")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@ondblclick='addtocart()']")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.dismiss();
		Thread.sleep(2000);
		driver.close();
	}

}
