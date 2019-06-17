package week2.day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.jar.asm.Opcodes;

public class ZoomCar {
	static ChromeDriver driver;
	public static void main(String[] args) {
		setUp();
		launchURL();
		ListOfCars highestPrice = getHighestPrice();
		System.out.println(highestPrice.carName + " : "+highestPrice.price);
		quit();
	}
	private static void quit() {
		System.out.println("Closing browser");
		driver.quit();		
	}
	private static void setUp() {
		// add system.setproperty
		driver = new ChromeDriver();
		Options manage = driver.manage();
		manage.window().maximize();
		manage.timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	private static void launchURL() {
		driver.get("https://www.zoomcar.com/chennai/search/query?lat=12.9416037&lng=80.2362096&starts=2019-06-15%2013%3A00&ends=2019-06-17%2019%3A00&type=zoom_later&bracket=no_fuel");
	}

	private static ListOfCars getHighestPrice() {
		// Get All the car Names
		List<WebElement> carNames = driver.findElementsByXPath("//div[@class='details']//h3");
		// get all the price of cars
		List<WebElement> prices = driver.findElementsByXPath("//div[@class='price']");
		List<ListOfCars> list = new ArrayList<ListOfCars>();
		for (int i = 0; i < carNames.size(); i++) {
			// get car name from list of WebElement
			String text = carNames.get(i).getText();
			// get price from List of WebElement
			String price = prices.get(i).getText();
			// Converting string to integer and removing , or any other special char so that we can sort it
			int parseInt = Integer.parseInt(price.replaceAll("\\D", ""));
			list.add(new ListOfCars(text, parseInt));
		}
		ListOfCars max = Collections.max(list);
		return max;
	}
}
class ListOfCars implements Comparable<ListOfCars>{
	public ListOfCars(String carName, int price) {
		this.carName = carName;
		this.price = price;
	}

	String carName;
	int price;

	@Override
	public int compareTo(ListOfCars car) {
		if(this.price < car.price) {
			return -1;
		}else return 1;
	}

}
