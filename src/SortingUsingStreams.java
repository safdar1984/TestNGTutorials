import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SortingUsingStreams {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//th[@role='columnheader'][1]")).click();
		List<WebElement> elements = driver.findElements(By.xpath("//tbody/tr/td[1]"));

		/*
		 * for(int i=0; i<elements.size();i++) {
		 * 
		 * String vegiesList = elements.get(i).getText(); if(vegiesList.equals("Almond")
		 * ) {
		 * 
		 * String price =
		 * elements.get(i).findElement(By.xpath("following-sibling::td[1]")).getText();
		 * System.out.println("Price of "+vegiesList+" is "+price); }
		 * 
		 * }
		 */

		// Applying the same solution without Loop and with streams

		List<String> originalList = elements.stream().map(s -> s.getText()).collect(Collectors.toList());

		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());

		Assert.assertTrue(originalList.equals(sortedList));
		List<String> price;

		do {
			List<WebElement> rows = driver.findElements(By.xpath("//tbody/tr/td[1]"));
			price = rows.stream().filter(s -> s.getText().contains("Wheat")).map(s -> getVeggiesPrice(s))
					.collect(Collectors.toList());
			price.forEach(a -> System.out.println(a));

			if (price.size() < 1) {
				driver.findElement(By.cssSelector("[aria-label='Next']")).click();
			}

		} while (price.size() < 1);
	}

	private static String getVeggiesPrice(WebElement s) {

		String value = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return value;
	}

}
