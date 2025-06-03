package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class New1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.alertIsPresent());
		
		WebElement dropBox =	driver.findElement(By.xpath(""));
		dropBox.click();
		
		//*************************************
		Alert a =	driver.switchTo().alert();
		a.accept();
		
		//****************************************************
		Actions a1 = new Actions(driver);
		a1.moveToElement(dropBox).build().perform();
		
		//******************************
		driver.switchTo().frame(0);
		
		
		// ****************************************
		Select s = new Select(dropBox);
		s.selectByVisibleText("");
		s.selectByValue("");
		s.selectByIndex(0);
		
		//*************************************************
		
		driver.findElement(By.xpath("//button[@id='menu1']")).click();
		
		List<WebElement> alldrop=	driver.findElements(By.xpath("//ul[contains(@class, 'dropdown')]/li/a"));
		
		for(WebElement d:alldrop) {
			
			if(d.getText().equalsIgnoreCase("JAVASCRIPT")) {
				d.click();
			}
			
		}
		
	}
	
}
