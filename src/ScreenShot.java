import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		//Step1: Cast
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		//Step2: use getScreenshotAs()
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		//step3: store SS
		File desc = new File("./photo/amazon.png");
		
		//step: copy paste SS
		
		FileUtils.copyFile(src, desc);
		driver.close();

	}

}
