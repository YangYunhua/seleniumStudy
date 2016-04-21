package seleniumTest;

import org.junit.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.*;

/*
 * 《基于 Selenium 2 的自动化测试》例5-2
 */
public class MyTest3 {
	WebDriver driver = new ChromeDriver();
	
	@Before
	public void setup() throws Exception{
		driver.get("http://literallycanvas.com");
	}
	
	@Test
	public void testcanvas() throws Exception{
		WebElement canvas = driver.findElement(By.xpath("//*[@id=\"literally-canvas\"]/div[1]/div[1]/canvas[1]"));
		Actions drawing = new Actions(driver);
		drawing.clickAndHold(canvas).
		moveByOffset(10, 50).
		moveByOffset(50, 10).
	/*	moveByOffset(-10, -50).
		moveByOffset(-50, -10).*/
		release().perform();

	}
	
	@After
	
	public void tearDown() throws Exception{
		
		driver.quit();
	}
	
}
