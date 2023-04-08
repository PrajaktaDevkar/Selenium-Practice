import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContains {

public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.findElement(By.xpath("//a[contains(text(),'LOGIN')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@id,'toPasswordRecoveryPageLink')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@id,'loginPasswordPage')]")).click();
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if(title.equals("SkillRary Courses"))
			{
			System.out.print("PASS");
			}
		else {
			System.out.println("Fail");
		}
		driver.close();
	}
}
