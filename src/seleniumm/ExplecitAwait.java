package seleniumm;

public class ExplecitAwait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Shabnam Computer\\chromedriver.exe");
		ExplecitAwait1 Z = new ExplecitAwait1();
		Z.login();
	}

}
