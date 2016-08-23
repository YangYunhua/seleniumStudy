package seleniumTest;
import org.junit.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.*;

/*
 * 《基于 Selenium 2 的自动化测试》例5-3
 */
public class MyTest4<driver> {

	WebDriver driver = new ChromeDriver();
	@Before
	public void setup() throws Exception{
		driver.get("http://jqueryui.com/draggable");
	}
	
	@Test
	public void testDrag() throws Exception{
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		Thread.sleep(3000);
		
		if(! isElementPresent(By.xpath("//*[@id=\"draggable\"]"))){
			Thread.sleep(3000);
		}
		
		WebElement drag = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		new Actions(driver).dragAndDropBy(drag, 200, 10).build().perform();
		Thread.sleep(10000);
	}
	
	@After
	public void tearDown() throws Exception{
		driver.quit();
	}

	/*
	 * 确认矩形方框是否存在
	 */
	private boolean isElementPresent(By xpath) {
		try{
			driver.findElement(xpath);
			return true;
		}catch(NoSuchElementException e){
			return false;
		}
		
	}
}
