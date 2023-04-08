import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

public static void main(String[] args) throws InterruptedException {
	
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/slider/");
		driver.switchTo().frame(0);
		WebElement ele = driver.findElement(By.xpath("//div[@id='slider']"));
		Actions a = new Actions(driver);
		a.dragAndDropBy(ele, 100, 0).perform();
		Thread.sleep(2000);
		a.dragAndDropBy(ele, 0, 0).perform();
		driver.close();

	}
}
