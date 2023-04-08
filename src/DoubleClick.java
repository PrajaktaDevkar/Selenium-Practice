import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DoubleClick {

public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		WebElement ele = driver.findElement(By.xpath("//select[@class='chosen-select']"));
		Select s= new Select(ele);
		s.selectByVisibleText("Testing");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Cucumber")).click();
		WebElement actionEle = driver.findElement(By.id("add"));
		Actions a = new Actions(driver);
		a.doubleClick(actionEle).perform();
		Thread.sleep(2000);
		WebElement actionMinus = driver.findElement(By.id("minus"));
		a.doubleClick(actionMinus).perform();
		Thread.sleep(2000);
		driver.close();

	}

}
