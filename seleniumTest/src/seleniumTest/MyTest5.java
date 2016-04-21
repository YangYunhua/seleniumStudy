package seleniumTest;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.*;
public class MyTest5 {

	WebDriver driver = new  ChromeDriver();
	
	@Before
	public void setup() throws Exception{
		driver.get("http://www.baidu.com");
		
	}
	
}
