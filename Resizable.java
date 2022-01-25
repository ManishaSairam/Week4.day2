package assignmentweek4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Resizable {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/resizable");
		driver.switchTo().frame(0);
		Actions builder = new Actions(driver);
		WebElement resizeEle = driver.findElement(By.xpath("//div[@id='resizable']/div[3]"));
		builder.dragAndDropBy(resizeEle, 300, 0).perform();
		Thread.sleep(5000);
		System.out.println("Element was resized");
		driver.quit();
	}
}
