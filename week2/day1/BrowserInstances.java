package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserInstances {
	private BrowserInstances() {}
	private static BrowserInstances instance = null;
	static final ThreadLocal<RemoteWebDriver> remoteWebdriver = new ThreadLocal<>();

	public static BrowserInstances getInstance() {
		if(instance == null) {
			instance = new BrowserInstances();
		}
		return instance;
	}
	public void setdriver() {
		remoteWebdriver.set(new ChromeDriver());
	}
	public RemoteWebDriver getDriver() {
		return remoteWebdriver.get();
	}
}