import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAndOr {

public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox' and @type='text']")).sendKeys("Phone");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//h2[contains(text(),'Gaming accessories')]"));
		String text = ele.getText();
		System.out.println(text);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox' or @type='text']")).clear();
		driver.close();
		
		
	}

}
