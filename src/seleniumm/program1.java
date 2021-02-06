package seleniumm;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.TakesScreenshot;

public class program1 {

	
	void login() throws InterruptedException
	{
		WebDriver d =new ChromeDriver();
		d.get("https://www.hdfcbank.com/");
		d.manage().window().maximize();//maximize
		
		JavascriptExecutor js = (JavascriptExecutor)d;
		js.executeScript("scrollBy(0, 400)");//scroll down
		
		Thread.sleep(5000);
		
		//JavascriptExecutor js1 = (JavascriptExecutor)d;
		js.executeScript("scrollBy(0, -250)");//scroll up
		
		Thread.sleep(3000);
		
		File src= ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		try
		{
			FileHandler.copy(src, new File("C:\\Shabnam Computer\\image1.png"));
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		
		
		
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");//scroll upto last
		
		Thread.sleep(3000);
		
		File src1= ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);//screenshot taking
		try
		{
			FileHandler.copy(src1, new File("C:\\Shabnam Computer\\image.png"));
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		
		d.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
