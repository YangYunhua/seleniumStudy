package seleniumTest;
import java.util.List;

import org.junit.*;

import static org.junit.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
/*
 * 
 * 判断表格共有多少行  并打印
 * 《Selenium菜谱》1.12 p46
 */
public class MyTest8 {

	WebDriver driver = new ChromeDriver();
	static String Driver_BASE_URL="D:\\selenium\\chromedriver.exe";
	
	@Before
	public void setup() throws Exception{
		driver.get("http://www.w3school.com.cn/html/html_tables.asp");
		
	}
	@Test
	public void test() throws Exception{
		//得到tr集合
		List<WebElement> rows = driver.findElements(By.cssSelector(".dataintable tr"));
		assertEquals(11,rows.size());
		for(WebElement row : rows){
			//得到当前tr中的td集合
			List<WebElement> cols = row.findElements(By.tagName("td"));
			for(WebElement col : cols){
				System.out.print(col.getText());
			}
			System.out.println();
		}
		driver.close();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", Driver_BASE_URL);
		MyTest8 test = new MyTest8();
		try {
			test.setup();
			test.test();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
