package seleniumm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;


public class Alert1 {
	void login()
	{
		WebDriver P = new ChromeDriver();
		P.get("http://demo.guru99.com/test/delete_customer.php");
		P.manage().window().maximize();
		
		
		
		 P.findElement(By.name("cusid")).sendKeys("53920");					
	     P.findElement(By.name("submit")).submit();	
	     
	     Alert alert = P.switchTo().alert();
	     alert.accept();	
	     
	}


}
