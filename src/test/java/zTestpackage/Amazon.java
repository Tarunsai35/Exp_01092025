package zTestpackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Amazon {

	public WebDriver driver;
	@Test
	public void amazon() {
		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		driver.get("https://www.amazon.com/");
		
		WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("twotabsearchtextbox")));
		searchBox.sendKeys("Headphones");
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Headphones");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		
//		List<WebElement> list = driver.findElements(By.xpath("//ul[@id='filter-p_123']/span//li"));
//		WebElement li;
//		for(int i = 0; i < list.size(); i++) {
//		 	li = list.get(i);
//		 	System.out.println(li);
//		}

		
		WebElement brandFilter = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//ul[@id='filter-p_123']/span//li)[1]")));
		brandFilter.click();
		
		
		
	}
}
