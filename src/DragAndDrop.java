import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		WebElement src = driver.findElement(By.xpath("//h1[contains(text(),'Block 1')]"));
		WebElement dec = driver.findElement(By.xpath("//h1[contains(text(),'Block 4')]"));
		Actions a = new Actions(driver);
		a.dragAndDrop(src, dec).perform();
		Thread.sleep(2000);
		driver.close();

	}

}
