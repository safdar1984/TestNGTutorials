import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.xpath("(//input[@name='name'])[1]")).sendKeys("Safdar Raza");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("safdar@test.test");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Password");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement dropDown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select DropDownValue = new Select(dropDown);
		DropDownValue.selectByIndex(0);
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("10/10/2000");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		System.out.println(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());
	}

}
