package seleniumTest;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
/*
 * 使用JQuery选择器 ：even选出右侧导航栏偶数（第一位索引是0）超链接
 * Download、Blog以及Browser Support
 * 《Selenium菜谱》1.11 p42
 */
public class MyTest6 {
	WebDriver driver = new ChromeDriver();
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	static String Driver_BASE_URL="D:\\selenium\\chromedriver.exe";
	
	@Before
	public void setup() throws Exception{
		driver.get("http://www.jquery.com/");
	}
	
	@Test
	public void JqueryTest() throws Exception{
		//使用JavascriptExecutor类执行JQuery的find（）方法来确认页面是否加载Jquery
		List<WebElement> elements = (List<WebElement>)jse.executeScript(
				"return jQuery.find"+
				"('.menu-item a:even')");
		assertEquals(3,elements.size());
		assertEquals("Download",elements.get(0).getText());
		assertEquals("Blog",elements.get(1).getText());
		assertEquals("Browser Support",elements.get(2).getText());
		driver.close();
		
	}
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", Driver_BASE_URL);
		MyTest6 test6 = new MyTest6();
			test6.setup();
			test6.JqueryTest();
	}

}
