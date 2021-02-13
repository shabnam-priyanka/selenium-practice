package seleniumm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover1 {
	void login() throws InterruptedException {
		WebDriver F = new ChromeDriver();
		
		F.get("https://www.demoqa.com/automation-practice-form");
		
		
		F.manage().window().maximize();
		F.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS); //implicit wait
		
		F.findElement(By.id("firstName")).sendKeys("Sabnam");
		F.findElement(By.xpath("//input[@id ='lastName']")).sendKeys("priyanka");
		F.findElement(By.xpath("//input[@id = 'userEmail']")).sendKeys("shabnam@gmail.com");
		Thread.sleep(2000);
		
		//F.findElement(By.id("custom-control-label")).click();
		WebElement check = F.findElement(By.className("custom-control-label"));// RADIO BUTTON
		boolean select =check.isSelected();
		//System.out.print(select);
		if(select ==false)// if the radio button not selected then it will click
		{
			check.click();
		}
		
		F.findElement(By.id("userNumber")).sendKeys("453635642"); // This is for CALENDAR
		Thread.sleep(2000);
//		F.findElement(By.id("dateOfBirthInput")).click();
		
		
		F.findElement(By.id("subjectsInput")).sendKeys("hrhrh");;
		
	}
}
