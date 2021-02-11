package seleniumm;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Shabnam Computer\\chromedriver.exe");
		WindowHandle1 Z = new WindowHandle1 ();
		Z.login();
	}

}
