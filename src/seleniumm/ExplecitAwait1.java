package seleniumm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplecitAwait1 {
	void login() throws InterruptedException {
		WebDriver F = new ChromeDriver();
		F.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS); //implicit wait
		F.get("https://gmail.com");
		
		WebDriverWait wait = new WebDriverWait(F,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("identifierId"))).sendKeys("rtuytrrrrr");;
		
		F.manage().window().maximize();
		//F.findElement(By.id("identifierId")).sendKeys("shabnam.priyank@gmail.com");
		
		
		//WebElement check = F.findElement(By.className("custom-control-level[4]")); with this it didn't work 	qw
		
		
	}
}
