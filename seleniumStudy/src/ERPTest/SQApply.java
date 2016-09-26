package ERPTest;
import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.*;

import com.google.common.base.Function;
import com.google.common.base.Predicate;

public class SQApply {
	private static final Predicate<WebDriver> ExpectedConditions = null;
	private static ChromeDriver driver;
	private static String Driver_BASE_URL="D:\\yangyh\\seleniumStudy.git\\trunk\\seleniumStudy\\chromedriver.exe";
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", Driver_BASE_URL);
		driver = new ChromeDriver();

		driver.get("http://182.61.30.149:8090/wd_erp/login.jsp");
		driver.findElementById("username").sendKeys("090");
		driver.findElementById("password").sendKeys("111111");
		driver.findElementById("login_sub").click();
		/*
		 * 隐性等待10s
		 */
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("项目合同管理")).click();
		driver.findElement(By.linkText("售前支持申请")).click();
		driver.findElement(By.linkText("申请")).click();
		if (!driver.findElement(By.xpath("//select[@id='sqAPPLY_TYPE']//option[2]")).isSelected()) {
			driver.findElement(By.xpath("//select[@id='sqAPPLY_TYPE']//option[2]")).click();
        }
		
		driver.findElement(By.id("sqAPPLICATION")).click();
		
		Thread.sleep(10000);
        
		System.out.println("111");
		
		driver.findElement(By.id("sqAPPLICATION")).sendKeys("test");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("sqSTART_TIME")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('sqSTART_TIME').readOnly=false;");
		driver.findElement(By.cssSelector("div.dwwo")).click();
		driver.findElement(By.xpath("//div[@class='dwwr']/div[2]/div/table/tbody/tr/td[2]/div/div[2]/div[2]")).click();
		driver.findElement(By.xpath("//div[@class='dwwr']/div[2]/div/table/tbody/tr/td[3]/div/div[2]/div[2]")).click();
        driver.findElement(By.cssSelector("span.dwb")).click();
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	
        driver.findElement(By.id("sqEND_TIME")).click();
		js.executeScript("document.getElementById('sqEND_TIME').readOnly=false;");
		driver.findElement(By.cssSelector("div.dwwo")).click();
		driver.findElement(By.xpath("//div[@class='dwwr']/div[2]/div/table/tbody/tr/td[2]/div/div[2]/div[2]")).click();
		driver.findElement(By.xpath("//div[@class='dwwr']/div[2]/div/table/tbody/tr/td[3]/div/div[2]/div[2]")).click();
        driver.findElement(By.cssSelector("span.dwb")).click();
        
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("sqSUGGEST_SUPPORT")).click();
		driver.findElement(By.xpath("//div[@id='tree_org']/li/div/span[1]")).click();
		driver.findElement(By.xpath("//div[10]/div[1]/button")).click();
		driver.findElement(By.id("sqSUGGEST_SUPPORT")).click();
		driver.findElement(By.xpath("//div[@id='tree_org']/li/div/span[1]")).click();
		driver.findElement(By.xpath("//div[@id='tree_org']/li/ul/li[2]/ul/li[2]/div/span[3]")).click();
		driver.findElement(By.xpath("//div[@id='tree_org']//span[.='黎胜龙']")).click();
		driver.findElement(By.xpath("//div[@class='ui-dialog-buttonset']/button[1]")).click();
		
		Thread.sleep(10000);
		System.out.println("111");
		driver.findElement(By.id("saveBut")).click();
		
		Thread.sleep(10000);
		System.out.println("111");
		driver.findElement(By.xpath("//div[11]/div[3]/div/button")).click();
		Thread.sleep(110000);
		System.out.println("222");
		driver.findElement(By.xpath("//div[@id='lb']/div/div[2]/div[4]/div[4]/button")).click();
		System.out.println("222");
        driver.findElement(By.xpath("//div[11]/div[3]/div/button[1]")).click();
        driver.findElement(By.xpath("//div[11]/div[3]/div/button")).click();
	}

}
