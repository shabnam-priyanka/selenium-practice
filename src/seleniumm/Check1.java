package seleniumm;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check1 {
	
	void log()
	{
	WebDriver K = new ChromeDriver();
	K.get("https://www.demoqa.com/automation-practice-form");
	
	K.manage().window().maximize();
	
	WebElement che = K.findElement(By.cssSelector("label[for= 'hobbies-checkbox-2'] "));
	boolean isEnabled = che.isEnabled();
	if(isEnabled = true)
	{
		che.click();
	}
	
	
	}
	
	
}
