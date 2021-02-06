package seleniumm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownn {

	
	

		
		void login() throws InterruptedException
		{
			WebDriver d =new ChromeDriver();
			d.get("https://demoqa.com/select-menu");
			d.manage().window().maximize();//maximize
			
			Select select =new Select(d.findElement(By.id("oldSelectMenu")));
			//select.selectByVisibleText("Yellow");
			select.selectByValue("5");
			
			
	
}
	}

