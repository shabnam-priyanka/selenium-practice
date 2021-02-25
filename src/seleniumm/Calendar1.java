package seleniumm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar1 {
	void login()
	{
		WebDriver P = new ChromeDriver();
		P.get("https://www.redbus.in/");
		P.manage().window().maximize();
		P.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
		WebElement fromdate =P.findElement(By.id("onward_cal"));
		((JavascriptExecutor)P).executeScript("document.getElementById('onward_cal').removeAttribute('readonly',0);"); //didn't understand
		fromdate.clear();
		fromdate.sendKeys("20-MAR-2019");
		
	}
}
