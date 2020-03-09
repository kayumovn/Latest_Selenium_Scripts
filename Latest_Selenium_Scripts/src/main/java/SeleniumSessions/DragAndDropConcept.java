package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropConcept {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
		
		WebElement sourceElement = driver.findElement(By.id("draggable"));
		WebElement targetElemenet = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		
//		action
//		.clickAndHold(sourceElement)
//		.moveToElement(targetElemenet)
//		.release()
//		.build()
//		.perform();
		
		action.dragAndDrop(sourceElement, targetElemenet).build().perform();
		
	}

}
