package ERPTest;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;



public class ScreenShot {

	public WebDriver driver;
	public ScreenShot(WebDriver driver){
		this.driver = driver;
	}
	
	private void takeScreenshot(String screenPath){
		try{
			File scrFile =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		    FileUtils.copyFile(scrFile, new File(screenPath));
		}catch(IOException e){
			System.out.println("Screen shot eror:"+screenPath);
		}
	}
	
	public void takeScreenshot(){
		String screanName = String.valueOf(new Date().getTime())+".jpg";
		File dir = new File("testresult/snapshot");
		if(!dir.exists())
			dir.mkdirs();
		String screanPath = dir.getAbsolutePath() + "/" + screanName;
		this.takeScreenshot(screanPath);
	}
	
}
