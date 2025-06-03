package otherSelenium;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();

		int nullEmptyCount = 0, brokenLinkCount = 0, notBrokenLinkCount = 0;

		List<WebElement> allLinks = driver.findElements(By.tagName("a"));

		for (WebElement link : allLinks) {
			String attValue = link.getAttribute("href");

			if (attValue == null || attValue.isEmpty()) {
				System.out.println("--> Attribute value is null/empty" + "\n" );
				nullEmptyCount++;
				continue;
			}
			try {
				URL linkurl = new URL(attValue);
				HttpURLConnection connec = (HttpURLConnection) linkurl.openConnection();
				connec.connect();

				if (connec.getResponseCode() >= 400) {
					System.out.println(attValue + " --> Broken Link - " + connec.getResponseCode());
					brokenLinkCount++;
				} else {
					System.out.println(attValue + " --> Not a Broken Link - " + connec.getResponseCode());
					notBrokenLinkCount++;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Number of Total Links are: --> " + allLinks.size());
		System.out.println("Number of Broken Links are: --> " + brokenLinkCount);
		System.out.println("Number of not Broken Links are: --> " + notBrokenLinkCount);
		System.out.println("Number of null/empty: --> " + nullEmptyCount);
		
		driver.quit();
	}
}
