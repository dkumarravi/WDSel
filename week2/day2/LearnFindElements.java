package week2.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFindElements {
	// WebTable
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/table.html");
		WebElement table = driver.findElementByTagName("table");
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		for (int i = 1; i < rows.size(); i++) {
			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			String text = cols.get(0).getText();
			if(text.contains("Elements")) {
				System.out.println(cols.get(1).getText());
				cols.get(2).click();
				break;
			}
		}
		
		
		List<WebElement> allTrainNames = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr/td[2]");
		for (WebElement tn : allTrainNames) {
			System.out.println(tn.getText());
		}
		
		
		
		/*driver.get("https://erail.in/trains-between-stations/mgr-chennai-ctr-MAS/thiruvananthapuram-central-TVC");
		driver.findElement(By.id("chkSelectDateOnly")).click();
		// find the table
		WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");
		// find all the rows
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		for (WebElement eachRow : rows) {
			// traverse through each row and get the TD
			List<WebElement> tds = eachRow.findElements(By.tagName("td"));
			// print the column text of first row alone
			System.out.println(tds.get(1).getText());
		}*/
		
	}

}
