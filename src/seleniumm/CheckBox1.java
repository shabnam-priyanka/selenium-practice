package seleniumm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox1 {
	void login() throws InterruptedException {
		WebDriver F = new ChromeDriver();
		F.get("https://www.demoqa.com/automation-practice-form");
		F.manage().window().maximize();
		
		//WebElement check = F.findElement(By.className("custom-control-level[4]")); with this it didn't work 	qw
		WebElement check = F.findElement(By.cssSelector("label[for ='hobbies-checkbox-1']"));
		boolean isEnabled =check.isEnabled();
		//System.out.print(select);
		if(isEnabled ==true)// if the radio button not selected then it will click
		{
			check.click();
		}
		
		
		
		
	
	}
}
