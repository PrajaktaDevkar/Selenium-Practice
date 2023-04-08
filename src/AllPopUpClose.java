import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllPopUpClose {

public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://demoqa.com/browser-windows");
		driver.get("https://www.naukri.com/");
		//driver.findElement(By.id("windowButton")).click();
		String parentBrowser = driver.getWindowHandle();
		System.out.println(parentBrowser);
		Set<String> childAndParentBrowser = driver.getWindowHandles();
		System.out.println(childAndParentBrowser);
		for(String allPopUp:childAndParentBrowser) {
			
			driver.switchTo().window(allPopUp);
			System.out.println(allPopUp);
			System.out.println(driver.getTitle());
		}
		driver.quit();
	}

}
