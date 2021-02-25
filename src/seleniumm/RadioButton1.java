package seleniumm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton1 {
	void login() throws InterruptedException {
		WebDriver F = new ChromeDriver();
		F.get("https://www.demoqa.com/radio-button");
		F.manage().window().maximize();
		
		WebElement radio= F.findElement(By.className("custom-control-label"));
		boolean select =radio.isSelected(); //isSelected(): Checks whether a checkbox is selected or not.
		System.out.print(select);
		if(select ==false) //performing click operation only if element is not selected
		{
			radio.click();  
			
		}
	

		
		
		
	}
}
