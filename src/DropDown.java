import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		WebElement ele = driver.findElement(By.xpath("//select[@id='gh-cat']"));
		Select s = new Select(ele);
		s.selectByIndex(3); 
		Thread.sleep(2000);
		s.selectByValue("12576");
		Thread.sleep(2000);
		s.selectByVisibleText("Art");
		List<WebElement> opt = s.getOptions();
		System.out.println(opt.size());
		for(WebElement eachElement:opt) {
			System.out.println(eachElement.getText());
		}
		
		driver.close();
		
	}
}
