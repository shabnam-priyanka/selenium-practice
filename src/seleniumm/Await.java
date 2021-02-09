package seleniumm;

public class Await {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Shabnam Computer\\chromedriver.exe");
		Await1 Z = new Await1();
		Z.login();
	}

}
