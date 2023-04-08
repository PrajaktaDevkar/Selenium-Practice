import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RemoveParentFromAllWin {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		driver.findElement(By.id("windowButton")).click();
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		Set<String> child = driver.getWindowHandles();
		System.out.println("Before removing Parent: "+" "+child.size()+" "+ child);
		child.remove(parent);
		System.out.println("After removing Parent: "+ " "+ child.size()+" "+ child);
		for(String allpopUp:child) {
			
			driver.switchTo().window(allpopUp);
			System.out.println(allpopUp);
			System.out.println(driver.getTitle());
		}
		
		driver.quit();
		
		
		

	}
}
