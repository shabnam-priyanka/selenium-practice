package seleniumm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewPractice {

	void login() throws InterruptedException {
		WebDriver F = new ChromeDriver();
		F.get("https://www.demoqa.com/radio-button");
		F.manage().window().maximize();
		
		WebElement radio= F.findElement(By.className("custom-control-label"));
		boolean select =radio.isSelected();
		System.out.print(select);
		if(select ==false)// if the RADIO button not selected then it will click
		{
			radio.click();
		}
		
		
		
		
	}
}
