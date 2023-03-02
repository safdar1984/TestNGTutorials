import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdateDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		//driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected();
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		//System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		System.out.println(driver.findElements(By.xpath("//div[@class='row1 padding-bottom-3 home-dis-checkboxes']/div")).size());
	//	System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
	//	System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		//System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
	
		//	System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			
			System.out.println("Enabled");
			Assert.assertTrue(true);
			
		}else{
			
			Assert.assertTrue(false);
			
		}
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		int i = 1;
		while(i<5) {
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id(("divpaxinfo"))).getText(), "5 Adult");
		//System.out.println(driver.findElement(By.id(("divpaxinfo"))).getText());
		
		
	}

}
