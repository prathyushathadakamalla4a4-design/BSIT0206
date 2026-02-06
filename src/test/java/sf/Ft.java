package sf;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Ft 
{
 WebDriver driver;
 @BeforeClass
 public void launch()
 {
	 driver = new ChromeDriver();
	 driver.get("https://www.firstcry.com");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 driver.manage().window().maximize();
 }
 @Test
 public void search() {
	WebElement s =  driver.findElement(By.id("search_box"));
	s.clear();
	s.sendKeys("books");
	//button
	driver.findElement(By.xpath("//span[@class='search-button']")).click();
	 
 }
 
}
