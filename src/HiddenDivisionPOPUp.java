import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPOPUp {

public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.busonlineticket.com/");
		driver.findElement(By.xpath("//a[@class='custom-nav-lnk active']")).click();
		driver.findElement(By.xpath("//input[@id='txtDepartDate']")).click();
		driver.findElement(By.xpath("//a[text()='26']")).click();
		Thread.sleep(2000);
		driver.close();
		}

}
