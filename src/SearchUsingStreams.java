import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SearchUsingStreams {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.id("search-field")).sendKeys("an");
		
		List<WebElement> vegies = driver.findElements(By.xpath("//tbody/tr/td[1]"));
		
		List<WebElement> filteredList = vegies.stream().filter(s->s.getText().contains("an")).collect(Collectors.toList());
		
		Assert.assertEquals(vegies.size(), filteredList.size());
	}

}
