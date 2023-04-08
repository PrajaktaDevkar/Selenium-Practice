import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement {

public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		org.openqa.selenium.WebElement eleText = driver.findElement(By.xpath("//h2[@class='_8eso']"));
		System.out.println("Get Text: "+eleText.getText());
		org.openqa.selenium.WebElement eleAtt = driver.findElement(By.xpath("//input[@name='email']"));
		System.out.println("Get Attribute: "+eleAtt.getAttribute("placeholder"));
		Point loc = eleAtt.getLocation();
		System.out.println("X-Cord: "+loc.getX());
		System.out.println("Y-Cord: "+loc.getY());
		Dimension size = eleAtt.getSize();
		System.out.println("Height : "+size.getHeight());
		System.out.println("Width : "+size.getWidth());
		driver.close();

	}
}
