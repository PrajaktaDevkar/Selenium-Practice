import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameByIndex {

public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.switchTo().frame("a077aa5e");
		driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
		Thread.sleep(2000);
		driver.close();
		
		
	}
}
