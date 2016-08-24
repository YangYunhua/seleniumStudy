package ERPTest;
import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.*;

import com.google.common.base.Function;
import com.google.common.base.Predicate;

public class QJ {
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
		driver.findElement(By.linkText("日常管理")).click();
		driver.findElement(By.linkText("请假/销假")).click();
		driver.findElement(By.linkText("请假")).click();
		if (!driver.findElement(By.xpath("//select[@id='leaveLEAVE_TYPE']//option[2]")).isSelected()) {
			driver.findElement(By.xpath("//select[@id='leaveLEAVE_TYPE']//option[2]")).click();
        }
		driver.findElement(By.id("PROJECT_NAME")).click();
		driver.findElement(By.xpath("//div[@id='tree_org']/li/ul/li[1]/div/span[2]")).click();
		driver.findElement(By.xpath("//div[@id='tree_org']//span[.='智隆信息（高教-技术-ERP系统)']")).click();
		driver.findElement(By.xpath("//div[@class='ui-dialog-buttonset']/button[1]")).click();
		driver.findElement(By.id("LEAVE_CONTENT")).click();
		driver.findElement(By.id("LEAVE_CONTENT")).sendKeys("testtesttesttesttesttesttesttest");
		driver.findElement(By.id("LEAVE_DURATION")).click();
		driver.findElement(By.id("LEAVE_DURATION")).sendKeys("0");
		
		Thread.sleep(10000);
		
		driver.findElement(By.cssSelector("div.dwwo")).click();
		System.out.println("111");
		driver.findElement(By.xpath("//div[@class='dwwr']/div[2]/div/table/tbody/tr/td[2]/div/div[2]/div[2]")).click();
		driver.findElement(By.xpath("//div[@class='dwwr']/div[2]/div/table/tbody/tr/td[3]/div/div[2]/div[2]")).click();
		driver.findElement(By.xpath("//div[@class='dwwr']/div[3]/div/table/tbody/tr/td[1]/div/div[2]/div[2]")).click();
		driver.findElement(By.cssSelector("div.dwwo")).click();
		driver.findElement(By.cssSelector("span.dwb")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='dwwr']/div[2]/div/table/tbody/tr/td[3]/div/div[2]/div[2]")).click();
		driver.findElement(By.xpath("//div[@class='dwwr']/div[3]/div/table/tbody/tr/td[1]/div/div[2]/div[2]")).click();
        
		driver.findElement(By.cssSelector("span.dwb")).click();
		driver.findElement(By.cssSelector("span.ace-file-container")).click();
		driver.findElement(By.id("FJ")).click();
		driver.findElement(By.id("saveBut")).click();
		driver.findElement(By.xpath("//div[10]/div[3]/div/button[1]")).click();
		driver.findElement(By.xpath("//div[11]/div[3]/div/button")).click();
		//driver.quit();
		
		
		//wait.until(((Object) ExpectedConditions).visiblityOfElenemtLocated(By.id("tbUsername")));
		//driver.findElement(By.id("tbUserName")).sendKeys("selenium");
	
		//driver.close();
	}

}
