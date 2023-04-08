import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckorWindowTitle {

public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		driver.findElement(By.id("windowButton")).click();
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		Set<String> child = driver.getWindowHandles();
		String title="xyz";
		for(String childPopUp:child) {
			driver.switchTo().window(childPopUp);
			String title1 = driver.getTitle();
			System.out.println(title1);
			if(title1.equals(title)) {
				System.out.println("Title Matched");
			}
			else {
				System.out.println("Title didn't matced");
			}
		}
		
		driver.quit();
	}

}
