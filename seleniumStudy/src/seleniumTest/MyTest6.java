package seleniumTest;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
/*
 * ʹ��JQueryѡ���� ��evenѡ���Ҳർ����ż������һλ������0��������
 * Download��Blog�Լ�Browser Support
 * ��Selenium���ס�1.11 p42
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
		//ʹ��JavascriptExecutor��ִ��JQuery��find����������ȷ��ҳ���Ƿ����Jquery
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
