package seleniumm;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;





public class Demo1 {
	void login() throws InterruptedException {
		WebDriver F = new ChromeDriver();
		F.get("https://angry-poincare-5dea45.netlify.app/");//opening the web page
		
		F.manage().window().maximize();//maximizing the window
		
		JavascriptExecutor vs = (JavascriptExecutor)F;
		vs.executeScript("scrollBy(0, 500)"); //scrolling down
		
		
		Thread.sleep(5000);
		
		vs.executeScript("scrollBy(0, -500)");//scrolling up
		Thread.sleep(5000);
		
		vs.executeScript("window.scrollBy(0,document.body.scrollHeight)");//scrolling all the way down
		Thread.sleep(5000);
		
		File src = ((TakesScreenshot)F).getScreenshotAs(OutputType.FILE);
		
		try
		{
			FileHandler.copy(src, new File("C:\\Shabnam Computer\\image6.png"));
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		F.quit();
		
	}
}
