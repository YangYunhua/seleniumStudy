package ERPTest;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.*;

import com.gargoylesoftware.htmlunit.javascript.host.Document;
import com.google.common.base.Predicate;

public class workApply {
	private static final Predicate<WebDriver> ExpectedConditions = null;
	private static ChromeDriver driver;
	private static String Driver_BASE_URL="D:\\yangyh\\seleniumStudy.git\\trunk\\seleniumStudy\\chromedriver.exe";
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", Driver_BASE_URL);
		driver = new ChromeDriver();
		ScreenShot ss = new ScreenShot(driver);
		
		/*
		 * login
		 */
		driver.get("http://182.61.30.149:8090/wd_erp/login.jsp");
		driver.findElement(By.id("username")).sendKeys("090");
		driver.findElement(By.id("password")).sendKeys("111111");
		driver.findElement(By.id("login_sub")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		/*
		 * test
		 */
		driver.findElement(By.linkText("日常管理")).click();
		driver.findElement(By.linkText("任务发布")).click();
		driver.findElement(By.linkText("任务新增")).click();
		driver.findElement(By.id("sqTASK_TITLE")).click();
		driver.findElement(By.id("sqTASK_TITLE")).sendKeys("test");
		driver.findElement(By.id("sqTASK_DETAILS")).click();
		driver.findElement(By.id("sqTASK_DETAILS")).sendKeys("test");
	
		driver.findElement(By.id("sqSTART_TIME")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('sqSTART_TIME').readOnly=false;");
		driver.findElement(By.cssSelector("div.dwwo")).click();
		driver.findElement(By.xpath("//div[@class='dwwr']/div[2]/div/table/tbody/tr/td[2]/div/div[2]/div[2]")).click();
		driver.findElement(By.xpath("//div[@class='dwwr']/div[2]/div/table/tbody/tr/td[3]/div/div[2]/div[2]")).click();
		driver.findElement(By.cssSelector("span.dwb")).click();
		System.out.println("test2");
		Thread.sleep(3000);
		
		driver.findElement(By.id("sqEND_TIME")).click();
		js.executeScript("document.getElementById('sqEND_TIME').readOnly=false;");
		System.out.println("test");
		driver.findElement(By.cssSelector("div.dwwo")).click();
		driver.findElement(By.xpath("//div[@class='dwwr']/div[2]/div/table/tbody/tr/td[2]/div/div[2]/div[2]")).click();
		driver.findElement(By.xpath("//div[@class='dwwr']/div[2]/div/table/tbody/tr/td[3]/div/div[2]/div[2]")).click();
		driver.findElement(By.cssSelector("span.dwb")).click();
		System.out.println("test2");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("sqMAIN_FEED")).click();
		driver.findElement(By.id("sqMAIN_FEED")).clear();
		driver.findElement(By.id("sqMAIN_FEED")).sendKeys("@余峰@王磊鑫");
		System.out.println("test3");
		Thread.sleep(3000);
		
		js.executeScript("arguments[0].click();",driver.findElement(By.id("sqCC_LIST")));

		/*driver.findElement(By.id("sqCC_LIST")).click();*/
		driver.findElement(By.id("sqCC_LIST")).clear();
		driver.findElement(By.id("sqCC_LIST")).sendKeys("@朱士超");
		System.out.println("test4");
		ss.takeScreenshot();
		
		Thread.sleep(3000);
		
		//driver.findElement(By.id("FJ")).click();
		js.executeScript("arguments[0].click();",driver.findElement(By.id("FJ")));
		//js.executeScript("arguments[0].sendKeys('D:\\yangyh\\seleniumStudy.git\\trunk\\seleniumStudy\\fileupload\\test.java');",driver.findElement(By.id("FJ")));
	
		Thread.sleep(6000);
		driver.findElement(By.id("saveBut")).click();
		driver.findElement(By.xpath("//div[@class='ui-dialog-buttonset']/button")).click();
		driver.findElement(By.xpath("//div[@class='col-xs-3']/button")).click();
		driver.findElement(By.xpath("//div[@class='ui-dialog-buttonset']/button[1]")).click();
		driver.findElement(By.xpath("//div[@class='ui-dialog-buttonset']/button")).click();
        
        Thread.sleep(100);
		driver.close();
	}

}
