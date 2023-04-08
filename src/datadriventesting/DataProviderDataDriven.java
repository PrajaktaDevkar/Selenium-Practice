package datadriventesting;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDataDriven {

	WebDriver driver;
	@BeforeClass
	public void setup() {
		driver= new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
	}
	
	@Test(dataProvider="LoginData")
	public void login(String email,String password) throws InterruptedException {
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys(password);
		Thread.sleep(4000);
	}
	
	
	@DataProvider(name="LoginData")
	public String[][] getData() throws IOException {
		String filePath=".\\dataFiles\\DataProviderDataDriven.xlsx";
		XLUtility xlutil = new XLUtility(filePath);
		int totalrow = xlutil.getRowCount("Sheet1");
		int totalcell = xlutil.getCellCount("Sheet1", 1);
		
		String login[][]= new String[totalrow][totalcell];
		
		for(int i=1;i<=totalrow;i++) {
			for(int j=0;j<totalcell;j++) {
				
				login[i-1][j]=xlutil.getCellData("Sheet1", i, j);
			}
		}
		
		return login;
	}
		
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	
	
	
}
