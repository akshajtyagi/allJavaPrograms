package otherSelenium;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken1{
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(null));
		
		List<WebElement> allLinks =	driver.findElements(By.tagName("a"));
		int brokenLinkCount=0;
		int notBrokenLinkcount=0;
		for(WebElement link:allLinks) {
			
			String attValue =	link.getAttribute("href");
			
			if(attValue==null || attValue.isEmpty()) {
				System.out.println("Attribute value is null/empty");
				continue;
			}
			try {
			URL url = new URL(attValue);
			HttpURLConnection connec = (HttpURLConnection) url.openConnection();
			connec.connect();
			
				if(connec.getResponseCode()>=400) {
					System.out.println(attValue + " >> Broken Link");
					brokenLinkCount++;
				}else {
					System.out.println(attValue + " >> Not a Broken Link");
					notBrokenLinkcount++;
				}
			}catch(Exception e){
				e.printStackTrace();
				}
			}
		
		System.out.println("all links are: >> "+ allLinks.size());
		System.out.println("No of Broken Links are: >> "+  brokenLinkCount);
		System.out.println("Not Broken links are: >> " + notBrokenLinkcount);
		driver.quit();
		
	}
}
