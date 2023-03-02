import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment5 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//label[@for='benz']/input")).click();
		String option =driver.findElement(By.xpath("//label[@for='benz']")).getText();
		
		WebElement dropDown = driver.findElement(By.id("dropdown-class-example"));
		Select dropDownValue = new Select(dropDown);
		dropDownValue.selectByVisibleText(option);
	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
		driver.findElement(By.id("name")).sendKeys(option);
		driver.findElement(By.id("alertbtn")).click();
		
		
		String alertText = driver.switchTo().alert().getText();
		
		if(alertText.contains(option)) {
			
			System.out.println("Text is present");
		}else {
			
			System.out.println("Text is not present");
		}

	}

}
