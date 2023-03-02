import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SelIntroduction {

	public static void main(String[] args) {

	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sra\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		WebDriver driver = new EdgeDriver(); 
		driver.get("https://artapp.lighthouse.watch/");
		System.out.println(driver.getTitle());
		driver.close();
		

	}

}
