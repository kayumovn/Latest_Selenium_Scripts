package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxHeadLess {

	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();

		FirefoxOptions fo = new FirefoxOptions();
		fo.addArguments("--headless");
		
		WebDriver driver = new FirefoxDriver(fo);
		
		driver.get("http://www.facebook.com");
		
		System.out.println(driver.getTitle());
		
		
		
		
	}

}
