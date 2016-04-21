package seleniumTest;
import static org.junit.Assert.assertEquals;

import org.junit.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;

/*
 * 《基于 Selenium 2 的自动化测试》例5-1
 */
public class MyTest2 {

	WebDriver driver = new ChromeDriver();
	@Before
	public void setup() throws Exception{
		driver.get("http://videojs.com/");	//打开http://videojs.com/主界面
	}
	
	@Test
	public void testvideo() throws InterruptedException{
		WebElement video = driver.findElement(
				By.id("preview-player_html5_api")); //通过id定位播放元素。
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		String source = (String)jse.executeScript("return arguments[0].currentSrc;", video);
		assertEquals("http://vjs.zencdn.net/v/oceans.mp4", source);
		jse.executeScript("return arguments[0].play();", video);
		Thread.sleep(5000);
		jse.executeScript("arguments[0].pause()", video);
	}
	
	@After
	public void teardown() throws Exception{
		driver.quit();
	}
	

}
