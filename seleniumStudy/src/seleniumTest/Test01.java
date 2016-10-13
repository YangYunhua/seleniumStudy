package seleniumTest;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test01 {

	static String Driver_BASE_URL="E:\\seleniumStudy\\trunk\\seleniumStudy\\chromedriver.exe";
	
	public static void main (String[] args){
		System.setProperty("webdriver.chrome.driver", Driver_BASE_URL);
		ChromeDriver driver = new ChromeDriver();
		Navigation navigation = driver.navigate();
		
		/*driver.get("http://www.baidu.com");*/
		navigation.to("http://www.zto.com/");
		navigation.to("http://www.baidu.com");
		try{
			Thread.sleep(3000);
		}catch (InterruptedException e){
			e.printStackTrace();
		}
		navigation.back();
		try{
			Thread.sleep(3000);
		}catch (InterruptedException e){
			e.printStackTrace();
			
		}
		navigation.forward();
		navigation.refresh();
		driver.findElement(By.id("kw")).sendKeys("test");
		/*driver.findElement(By.linkText("登录")).click();*/
		/*driver.findElement(By.partialLinkText("登")).click();*//*模糊查找链接*/
		driver.findElement(By.tagName("a")).click();/*按标记名称进行查找，并返回第一个匹配项*/
	}
}


