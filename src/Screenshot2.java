import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot2 {

public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		TakesScreenshot ts = (TakesScreenshot)driver; // cast
		File src = ts.getScreenshotAs(OutputType.FILE); // SS
		File dec = new File("./Photo/myntra.png"); // store img
		FileUtils.copyFile(src, dec);
		driver.close();
		
	}
}
