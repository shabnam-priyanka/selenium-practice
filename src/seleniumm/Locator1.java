package seleniumm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locator1 {

	void login()
	{
		WebDriver L = new ChromeDriver();
		L.get("https://demoqa.com/select-menu");
		L.manage().window().maximize();
		
		Select select =new Select(L.findElement(By.id("oldSelectMenu")));
		select.selectByVisibleText("Yellow");
		//select.selectByValue("5");
	}
}