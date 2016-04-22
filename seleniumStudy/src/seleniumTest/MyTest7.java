package seleniumTest;
import static org.junit.Assert.*;

import org.junit.Assert.*;

import java.util.List;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
/*
 * 找出百度首页所有连接
 * 《Selenium菜谱》1.11 p45
 */
public class MyTest7 {
	WebDriver driver = new ChromeDriver();
	JavascriptExecutor jsp = (JavascriptExecutor)driver;
	static String Driver_BASE_URL="D:\\selenium\\chromedriver.exe";
	
	
	@Before
	public void setup() throws Exception{
		driver.get("http://www.baidu.com");
		
	}
	
	@Test
	public void JqueyTest() throws Exception{
		List<WebElement> links = (List<WebElement>)jsp.executeScript
				("return jQuery.find('a')");
		assertEquals(32,links.size());
		for(int i = 0; i<links.size();i++){
			System.out.println(links.get(i).getText());
		}
		driver.close();
	}
	
	/*
	 * 判断是否页面已加载jQuery
	 */
	private void isJquery(){
		if(!jQueryLoaded()){
			injQuery();
			
		}else{
			System.out.printf("jQuery existed");
		}
	}
	private boolean jQueryLoaded(){
		// TODO Auto-generated method stub
		Boolean load;
		try{
			load = (Boolean) jsp.executeScript("return jQuery() != null");
		}catch(WebDriverException e){
			load = false;
			e.printStackTrace();
		}
		return load;
	}
	private void injQuery() {
		// TODO Auto-generated method stub
		jsp.executeScript("var headID = "
				+ "document.getElementsByTagName(\"head\")[0];"
				+ "var newScript = document.createElement('script');"
				+"newScript.type = 'text/javascript';"
				+"newScript.src = 'http://ajax.googleapis.com/ajax/lis/jquery/1.7.2/jquery.min.js';"
				+"headID.appendChild(newScript);");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", Driver_BASE_URL); 
		MyTest7 test = new MyTest7();
		try {
			test.setup(); 
			/*如果将判断放在最后一步会有如下错误：
			org.openqa.selenium.remote.SessionNotFoundException: no such session
			  (Driver info: chromedriver=2.9.248315,platform=Windows NT 6.1 SP1 x86_64) (WARNING: The server did not provide any stacktrace information)
			Command duration or timeout: 15 milliseconds
			Build info: version: '2.45.0', revision: '5017cb8', time: '2015-02-27 00:00:10'
			System info: host: 'MS-20160130XDGP', ip: '169.254.113.225', os.name: 'Windows 7', os.arch: 'amd64', os.version: '6.1', java.version: '1.8.0_71'
			Driver info: org.openqa.selenium.chrome.ChromeDriver
			Capabilities [{applicationCacheEnabled=false, rotatable=false, chrome={userDataDir=C:\Users\ADMINI~1\AppData\Local\Temp\scoped_dir4880_21094}, takesHeapSnapshot=true, databaseEnabled=false, handlesAlerts=true, version=48.0.2564.97, platform=XP, browserConnectionEnabled=false, nativeEvents=true, acceptSslCerts=true, locationContextEnabled=true, webStorageEnabled=true, browserName=chrome, takesScreenshot=true, javascriptEnabled=true, cssSelectorsEnabled=true}]
			Session ID: 8696e904528cba187b131b9076589c8b*/
			test.isJquery();
			test.JqueyTest();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
