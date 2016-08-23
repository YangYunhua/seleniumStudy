package ERPTest;
import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.*;

import com.google.common.base.Predicate;

public class SVN {
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
		driver.findElement(By.linkText("项目合同管理")).click();
		driver.findElement(By.linkText("SVN账号申请")).click();
		driver.findElement(By.linkText("申请")).click();
		driver.findElement(By.id("sqSVN_ATALOG")).click();
		driver.findElement(By.id("sqSVN_ATALOG")).sendKeys("test/test");
        if (!driver.findElement(By.xpath("//select[@id='sqAPPLY_POWER']//option[2]")).isSelected()) {
        	driver.findElement(By.xpath("//select[@id='sqAPPLY_POWER']//option[2]")).click();
        }
        driver.findElement(By.id("sqREASONS_APPLICATION")).click();
        driver.findElement(By.id("sqREASONS_APPLICATION")).sendKeys("test");
        driver.findElement(By.id("sqPROJECT_NAME")).click();
        driver.findElement(By.xpath("//div[@id='tree_org']/li/ul/li[1]/div/span[2]")).click();
        driver.findElement(By.xpath("//div[@id='tree_org']//span[.='智隆信息（高教-技术-ERP系统)']")).click();
        driver.findElement(By.xpath("//div[@class='ui-dialog-buttonset']/button[1]")).click();
        driver.findElement(By.id("sqPERSONNEL")).click();
        driver.findElement(By.id("sqPERSONNEL")).sendKeys("杨云华");
        driver.findElement(By.id("saveBut")).click();
        driver.findElement(By.xpath("//div[11]/div[3]/div/button")).click();
        driver.findElement(By.xpath("//div[@class='col-xs-3']/button")).click();
        driver.findElement(By.xpath("//div[11]/div[3]/div/button[1]")).click();
        ss.takeScreenshot();
        driver.findElement(By.xpath("//div[11]/div[3]/div/button")).click();
        
        
		Thread.sleep(100);
		driver.close();
	}

}
