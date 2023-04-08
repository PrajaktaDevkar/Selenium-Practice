import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttribute {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.findElement(By.xpath("//a[text()='LOGIN']")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("user");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("user");
		driver.findElement(By.xpath("//button[@id='last']")).click();
		String Title = driver.getTitle();
		System.out.println(Title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.close();
		
		
	}
}
