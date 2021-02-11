package seleniumm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseClicking1 {
	void login() throws InterruptedException {
		WebDriver F = new ChromeDriver();
		
		F.get("https://demoqa.com/buttons");
		
		
		F.manage().window().maximize();
		
		/*Actions a=new Actions(F);
		WebElement button = F.findElement(By.id("doubleClickBtn"));
		a.doubleClick(button).perform();*///mouse double click
		//F.switchTo().alert().accept();
		
		Actions a=new Actions(F);
		WebElement button = F.findElement(By.id("rightClickBtn"));
		a.contextClick(button).perform();
		
	}
}
