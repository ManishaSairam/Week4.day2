package assignmentweek4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sortable {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/sortable");
		driver.switchTo().frame(0);
		Actions builder = new Actions(driver);
		WebElement item1 = driver.findElement(By.xpath("//ul[@id=\"sortable\"]/li[1]"));
//		WebElement item2 = driver.findElement(By.xpath("//ul[@id=\"sortable\"]/li[2]"));
		WebElement item3 = driver.findElement(By.xpath("//ul[@id=\"sortable\"]/li[3]"));
//		WebElement item4 = driver.findElement(By.xpath("//ul[@id=\"sortable\"]/li[4]"));
//		WebElement item5 = driver.findElement(By.xpath("//ul[@id=\"sortable\"]/li[5]"));
//		WebElement item6 = driver.findElement(By.xpath("//ul[@id=\"sortable\"]/li[6]"));
//		WebElement item7 = driver.findElement(By.xpath("//ul[@id=\"sortable\"]/li[7]"));
		builder.clickAndHold(item1).moveToElement(item3).release(item1).perform();
		System.out.println("Sortable was performed");
	}
}
