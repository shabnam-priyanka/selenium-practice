package seleniumm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar2 {

	void login()
	{
	WebDriver P = new ChromeDriver();
	P.get("https://www.redbus.in/");
	P.manage().window().maximize();
	
    P.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    WebElement dateBox = P.findElement(By.id("onward_cal"));
    


    dateBox.clear();
    dateBox.sendKeys("20-MAR-2019");
    
    
    
    }
	
}
