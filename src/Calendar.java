/*import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/Travel-companion/");
		Thread.sleep(3000);
		//driver.findElement(By.id("form-field-travel_comp_date")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).click();
		List<WebElement> dates = driver.findElements(By.className("flatpickr-day"));
		System.out.println(dates.size());
	}

}*/
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

public static void main(String[] args) throws InterruptedException {
// TODO Auto-generated method stub

//System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.path2usa.com/travel-companions");
driver.manage().window().maximize();
Thread.sleep(3000);
//April 23
//driver.findElement(By.xpath(".//*[@id='travel_date']")).click();
JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("window.scrollBy(0,500)");

driver.findElement(By.id("form-field-travel_comp_date")).click();

while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("May"))
{
driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
}


List<WebElement> dates= driver.findElements(By.className("day"));
//Grab common attribute//Put into list and iterate
int count=driver.findElements(By.className("day")).size();

for(int i=0;i<count;i++)
{
String text=driver.findElements(By.className("day")).get(i).getText();
if(text.equalsIgnoreCase("21"))
{
driver.findElements(By.className("day")).get(i).click();
break;
}

}
}

}
