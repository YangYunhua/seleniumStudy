package seleniumTest;
import seleniumTest.*;
public class testMyTest {

	static String Driver_BASE_URL="D:\\selenium\\chromedriver.exe";
	 
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", Driver_BASE_URL);
		// TODO Auto-generated method stub
		/*MyTest2 test = new MyTest2();
		test.setup();
		test.testvideo();
		test.teardown();*/
		
		/*MyTest3 test3 = new MyTest3();
		test3.setup();
		test3.testcanvas();
		test3.tearDown();*/
		MyTest4 test4 = new MyTest4();
		test4.setup();
		test4.testDrag();
		test4.tearDown();
	}

}
