import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(3));
	
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
	
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("myModal")));
		driver.findElement(By.id("okayBtn")).click();
		
		WebElement dropDown = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select dropDownValue = new Select(dropDown);
		dropDownValue.selectByIndex(2);
		
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='nav-link btn btn-primary']")));
		List<WebElement> products = driver.findElements(By.xpath("//div[@class='card-body']"));
		
		for(int i=0; i<products.size();i++) {
			
			driver.findElements(By.xpath("//button[@class='btn btn-info']")).get(i).click();
			
		}
		driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();
	}

}
