package ERPTest;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	WebDriver driver = new ChromeDriver();
	@Before
	public void setup() throws Exception{
		driver.get("http://182.61.30.149:8090/wd_erp/login.jsp");
	}
	
	@Test
	public void testLogin() throws InterruptedException{
		driver.findElement(By.id("username")).sendKeys("090");
		driver.findElement(By.id("password")).sendKeys("111111");
		driver.findElement(By.id("login_sub")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@After
	public void teardown() throws Exception{
		driver.quit();
	}


}
