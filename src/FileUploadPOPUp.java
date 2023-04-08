import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPOPUp {

public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='file'])[1]")).sendKeys("C:\\Users\\praja\\Downloads\\bank.pdf");
		
	}
}
