import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test {

	static WebDriver driver;
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
	
	
	}

}
