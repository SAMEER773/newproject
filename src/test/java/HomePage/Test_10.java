package HomePage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_10 {
	
	public void test() {
		
		String key="webdriver.chrome.driver";
		String Value="C:\\Users\\win10\\eclipse-workspace\\Amazon\\Drivers\\chromedriver.exe";
		System.setProperty(key, Value);
		
		WebDriver diver= new ChromeDriver();
		
		diver.get("https://www.flipkart.com/");
		
		diver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS)	;
		
		
		diver.close();
		diver.quit();
		
		
		
	}

}
