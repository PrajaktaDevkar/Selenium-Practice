package datadriventesting;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterDataDrivenTesting {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	
		XLUtility xlutil = new XLUtility(".\\dataFiles\\RegTestData.xlsx");
		int rowcount= xlutil.getRowCount("Sheet1");
		//System.out.println(rowcount);
		int cellcount = xlutil.getCellCount("Sheet1", 1);
		//System.out.println(cellcount);
		
		xlutil.setCellData("Sheet1", 0, 4, "Status");
		
		for(int i=1;i<=rowcount;i++)
		{
		
			/*String firstname = xlutil.getCellData("Sheet1", i, 0);
			driver.findElement(By.id("firstname")).clear();
			driver.findElement(By.id("firstname")).sendKeys(firstname);
			
			
			String lastname = xlutil.getCellData("Sheet1", i, 1);
			driver.findElement(By.id("lastname")).clear();
			driver.findElement(By.id("lastname")).sendKeys(lastname);
			
			*/
			String email = xlutil.getCellData("Sheet1", i, 2);
			driver.findElement(By.id("email")).clear();
			driver.findElement(By.id("email")).sendKeys(email);
			
			String password = xlutil.getCellData("Sheet1", i, 3);
			driver.findElement(By.id("pass")).clear();
			driver.findElement(By.id("pass")).sendKeys(password);
			
			Thread.sleep(4000);
			
			if(i%2==0)
			xlutil.setCellData("Sheet1", i, 4, "pass");
			else
				xlutil.setCellData("Sheet1", i, 4, "fail");

		}
		
		driver.close();
		
	}
}
