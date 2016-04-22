package seleniumTest;
import static org.junit.Assert.*;

import java.util.*;

import org.junit.*;
/*import org.openqa.jetty.html.Link;*/
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class MyTest5 {
	/*
	 * 验证百度首页导航链接数量
	 * 《Selenium菜谱》1.4 p29
	 */

	WebDriver driver = new  ChromeDriver();
	
	@Before
	public void setup() throws Exception{
		driver.get("http://www.baidu.com");
		List<WebElement> links = driver.findElements(By.cssSelector("a[name=tj_trnuomi]"));
		//验证链接数量
		assertEquals(1, links.size());
		//打印href属性
		for(int i =0;i<links.size();i++){
			System.out.println(links.get(i).getAttribute("href"));
		}
		driver.quit();
	}
	
}
