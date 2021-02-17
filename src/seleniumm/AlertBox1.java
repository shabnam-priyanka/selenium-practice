package seleniumm;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBox1 {
	void login() throws InterruptedException {
		WebDriver F = new ChromeDriver();
		F.get("http://demo.guru99.com/test/delete_customer.php");
		F.manage().window().maximize();
		
		F.findElement(By.name("cusid")).sendKeys(new String[]{"53920"}); //why we writing new String []
		F.findElement(By.name("submit")).submit();
		//Thread.sleep(2000);
	    Alert alert =F.switchTo().alert();
	     alert.accept();
		
		
		
		
		
		
		
	}
	
	
	
}
