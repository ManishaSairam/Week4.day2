package assignmentweek4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Draggable {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/draggable/");
		driver.switchTo().frame(0);
		Actions builder = new Actions(driver);
		WebElement drag = driver.findElement(By.id("draggable"));
		builder.dragAndDropBy(drag, 150, 100).perform();
		Thread.sleep(2000);
		System.out.println("Element was dragged");
		driver.quit();
		
		
		
		
		
	}

}
