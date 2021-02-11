package seleniumm;

import java.util.Set;
import java.util.concurrent.TimeUnit;

//import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.Iterator;

public class WindowHandle1 {
	void login() throws InterruptedException {
		WebDriver F = new ChromeDriver();
		F.manage().window().maximize();
		F.get("https://www.naukri.com/");
		
		
		F.manage().window().maximize();
		
		String parent = F.getWindowHandle();
		Set<String>s=F.getWindowHandles();
		
		Iterator<String>I=s.iterator();
		while(I.hasNext())
		{
			String child_window=I.next();
			if(!parent.equals(child_window))
			{
				F.switchTo().window(child_window);
				F.close();
			}
		}
		F.switchTo().window(parent);
		
		
		
	
		
	}
	
	
}
