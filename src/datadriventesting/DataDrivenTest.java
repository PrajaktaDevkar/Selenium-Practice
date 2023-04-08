package datadriventesting;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import graphql.Assert;

public class DataDrivenTest {
	
	WebDriver driver;
	
	@BeforeClass
	 public void setup() 
	{
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();	
	}
	
	
	@Test(dataProvider="LoginData")
	public void loginTest(String username,String password,String res) throws InterruptedException {
		
		driver.get("https://admin-demo.nopcommerce.com/login");
		WebElement txtEmail = driver.findElement(By.id("Email"));
		txtEmail.clear();
		txtEmail.sendKeys(username);
		
		WebElement txtPassword = driver.findElement(By.id("Password"));
		txtPassword.clear();
		txtPassword.sendKeys(password);
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
		String exp_title="Dashboard / nopCommerce administration";
		String act_title=driver.getTitle();
		System.out.println(act_title);
		
		if(res.equals("valid")) 
		{
			if(exp_title.equals(act_title))
			{
				driver.findElement(By.linkText("Logout")).click();
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
			}
		}
		
		else if(res.equals("invalid"))
		{
			if(exp_title.equals(act_title))
			{
				driver.findElement(By.linkText("Logout")).click();
				Assert.assertTrue(false);
			}
			else
			{
				Assert.assertTrue(true);
			}
		}
	}
	
	
	@DataProvider(name="LoginData")
	public String [][] getData() throws IOException{
		
		//Hard-coded Data
		/*String loginData[][]= {
								{"admin@yourstore.com","admin","valid"},
								{"admin@yourstore.com","adm","invalid"},
								{"adm@yourstore.com","admin","invalid"},
								{"adm@yourstore.com","adm","invalid"}
							  };
		*/
		
		//Using Excel File
		
		String filePath=".\\dataFiles\\LoginData.xlsx";
		XLUtility xlutil= new XLUtility(filePath);
		
		int totalrow = xlutil.getRowCount("Sheet1");
		int totalCols = xlutil.getCellCount("Sheet1", 1);
		
		String loginData[][]= new String[totalrow][totalCols]; 
		
		for(int i=1;i<=totalrow;i++) 
		{
			for(int j=0;j<totalCols;j++) 
			{
				loginData[i-1][j]=xlutil.getCellData("Sheet1", i, j);
			}
		}
		
		return loginData;
	}
	

	@AfterClass
	
	public void tearDown() {
		driver.close();
	}
	
	

}
