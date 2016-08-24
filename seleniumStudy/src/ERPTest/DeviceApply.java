package ERPTest;
import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.*;

import com.google.common.base.Predicate;

public class DeviceApply {
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
		driver.findElement(By.linkText("设备申请")).click();
		driver.findElement(By.linkText("申请新增")).click();
		driver.findElement(By.id("sqapply_title")).click();
		driver.findElement(By.id("sqapply_title")).clear();
		driver.findElement(By.id("sqapply_title")).sendKeys("test");
	        if (!driver.findElement(By.xpath("//select[@id='squnit_type']//option[3]")).isSelected()) {
	        	driver.findElement(By.xpath("//select[@id='squnit_type']//option[3]")).click();
	        }
	        driver.findElement(By.id("sqRequirement")).click();
	        driver.findElement(By.id("sqRequirement")).clear();
	        driver.findElement(By.id("sqRequirement")).sendKeys("#￥%—？）*（！·*（*！（·*（！*·（·！（　　　　　　　　　　　—……！·—……＃—＊！＃");
	        driver.findElement(By.id("saveBut")).click();
	        driver.findElement(By.xpath("//div[@class='ui-dialog-buttonset']/button")).click();
	        driver.findElement(By.xpath("//div[@class='col-xs-3']/button")).click();
	        driver.findElement(By.xpath("//div[@class='ui-dialog-buttonset']/button[1]")).click();
	        ss.takeScreenshot();
	        driver.findElement(By.xpath("//div[@class='ui-dialog-buttonset']/button")).click();
        
        
		Thread.sleep(100);
		driver.close();
	}



}
