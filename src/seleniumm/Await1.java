package seleniumm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Await1 {
	void login() throws InterruptedException {
		WebDriver F = new ChromeDriver();
		F.get("https://www.demoqa.com/automation-practice-form");
		F.manage().window().maximize();
		F.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS); //implicit wait
		
		//WebElement check = F.findElement(By.className("custom-control-level[4]")); with this it didn't work 	qw
		WebElement check = F.findElement(By.cssSelector("label[for ='hobbies-checkbox-1']"));
		boolean isEnabled =check.isEnabled();
		//System.out.print(select);
		if(isEnabled ==true)// if the radio button not selected then it will click
		{
			check.click();
		}
		
		
		//checking 2nd check box
		
		//Thread.sleep(4000); // static await
		
		F.findElement(By.cssSelector("label[for ='hobbies-checkbox-2']")).click();
		
		
	}
}
