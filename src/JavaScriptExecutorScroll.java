import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorScroll {

public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		WebElement ele = driver.findElement(By.xpath("(//span[@class='a-size-small a-color-base truncate-2line'])[10]"));
		Point loc = ele.getLocation();
		int x = loc.getX();
		int y = loc.getY();
		System.out.println("Location : "+loc);
		System.out.println("X-cord: "+x);
		System.out.println("Y-Cord: "+y);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,5000)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-5000)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy("+x+","+y+")");
		ele.click();
		Thread.sleep(2000);
		driver.close();
	}

}
