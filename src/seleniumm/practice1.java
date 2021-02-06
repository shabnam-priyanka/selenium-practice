package seleniumm;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.TakesScreenshot;



public class practice1 {

	void login() throws InterruptedException // why we writing void before login
	{
		WebDriver d = new ChromeDriver();
		d.get("https://demoqa.com/");
		d.manage().window().maximize();
		
		JavascriptExecutor js =  (JavascriptExecutor)d;
		js.executeScript("scrollBy( 0,400)");//scroll down
		
		Thread.sleep(5000);
		
		File src = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(src, new File("C:\\Shabnam Computer\\\\image5.png"));
			
		}
		
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		Thread.sleep(5000);
		
		
		JavascriptExecutor js1 =  (JavascriptExecutor)d;//why we writing javascriptExecutor and d after it
		js1.executeScript("scrollBy( 0, -400)"); // scroll up
		
	
		Thread.sleep(5000);
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		Thread.sleep(5000);
		
		File src1 = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(src1, new File("C:\\Shabnam Computer\\\\image4.png"));
			
		}
		
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		
		
		Thread.sleep(3000);
		
		d.quit();
	}
}
