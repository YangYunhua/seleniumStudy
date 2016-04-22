package seleniumTest;
import static org.junit.Assert.*;

import java.util.*;

import org.junit.*;
/*import org.openqa.jetty.html.Link;*/
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class MyTest5 {
	/*
	 * ��֤�ٶ���ҳ������������
	 * ��Selenium���ס�1.4 p29
	 */

	WebDriver driver = new  ChromeDriver();
	
	@Before
	public void setup() throws Exception{
		driver.get("http://www.baidu.com");
		List<WebElement> links = driver.findElements(By.cssSelector("a[name=tj_trnuomi]"));
		//��֤��������
		assertEquals(1, links.size());
		//��ӡhref����
		for(int i =0;i<links.size();i++){
			System.out.println(links.get(i).getAttribute("href"));
		}
		driver.quit();
	}
	
}
