package seleniumm;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class practiceDay1 {
	
	void log() throws InterruptedException
	{
		WebDriver p = new ChromeDriver();
		p.get("https://demoqa.com/");
		
		p.manage().window().maximize();
		
		JavascriptExecutor se = (JavascriptExecutor)p;
		se.executeScript("scrollBy(0, 400)"); // scroll down
		
		Thread.sleep(3000);
		
		se.executeScript("scrollBy(0, -300)"); // half way down
		
		Thread.sleep(3000);
		
		se.executeScript("window.scrollBy(0, document.body.scrollHeight)");//scroll all the way down
		
		File src = ((TakesScreenshot)p).getScreenshotAs(OutputType.FILE);
		
		try
		{
			FileHandler.copy(src, new File("C:\\Shabnam Computer\\image1.png"));
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}

		
		
		
		
		p.quit();
	}
	

}
