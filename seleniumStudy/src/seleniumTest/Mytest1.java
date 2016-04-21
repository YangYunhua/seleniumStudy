package seleniumTest;

import java.util.*;

import junit.framework.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.google.common.base.Predicate;

public class Mytest1 {
	private static final Predicate<WebDriver> ExpectedConditions = null;
	private static WebDriver driver;
	private static String Driver_BASE_URL="D:\\selenium\\chromedriver.exe";
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", Driver_BASE_URL);
		driver = new ChromeDriver();
		/*driver.get("http://www.12306.cn");
		driver.manage().window().maximize();
		Thread.sleep(10);
		driver.findElement(By.className("k2")).click();
*/
		driver.get("http://www.cnblogs.com");
		driver.findElement(By.linkText("µÇÂ¼")).click();
		WebDriverWait wait = new WebDriverWait(driver, 300);
		
		//wait.until((ExpectedConditions).visiblityOfElenemtLocated(By.id("tbUsername")));
		driver.findElement(By.id("tbUserName")).sendKeys("selenium");
		Thread.sleep(100);
		driver.close();
	}

}
