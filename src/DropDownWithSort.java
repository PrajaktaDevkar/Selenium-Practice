import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownWithSort {

public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
		WebElement ele = driver.findElement(By.xpath("//select[contains(@class,'_9407 _5dba _9hk6 _8esg')]"));
		Select s = new Select(ele);
		s.selectByIndex(1);
		Thread.sleep(2000);
		ArrayList a = new ArrayList();
		List<WebElement> dayList = s.getOptions();
		System.out.println("Size of list:"+" "+dayList.size());
		for(WebElement x: dayList) {
			String text = x.getText();
			System.out.println(text);
			a.add(text);
		}
		Collections.sort(a);
		for(Object arrayDaySort: a)
		{
			System.out.println(arrayDaySort);
		}
	}
}
