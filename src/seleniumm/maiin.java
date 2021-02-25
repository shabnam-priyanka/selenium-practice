package seleniumm;

import java.io.FileNotFoundException;
import java.io.IOException;

public class maiin {

	public static void main(String[] args) throws IOException {
		// 
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Shabnam Computer\\chromedriver.exe");
		
		Frameework ob = new Frameework();
		ob.test();

	}

}
