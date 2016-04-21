package seleniumTest;
import static org.junit.Assert.assertEquals;

import org.junit.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;

/*
 * ������ Selenium 2 ���Զ������ԡ���5-1
 */
public class MyTest2 {

	WebDriver driver = new ChromeDriver();
	@Before
	public void setup() throws Exception{
		driver.get("http://videojs.com/");	//��http://videojs.com/������
	}
	
	@Test
	public void testvideo() throws InterruptedException{
		WebElement video = driver.findElement(
				By.id("preview-player_html5_api")); //ͨ��id��λ����Ԫ�ء�
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
