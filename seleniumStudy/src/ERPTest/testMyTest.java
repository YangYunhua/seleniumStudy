package ERPTest;
import seleniumTest.*;
public class testMyTest {

	static String Driver_BASE_URL="D:\\yangyh\\seleniumStudy.git\\trunk\\seleniumStudy\\chromedriver.exe";
	 
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", Driver_BASE_URL);
		// TODO Auto-generated method stub
	    Login login = new Login();
	    login.setup();
	    login.testLogin();

	    
	  /*  SVNApply svn = new SVNApply();
	    svn.setup();
	    svn.testSVN();*/
		
		/*MyTest3 test3 = new MyTest3();
		test3.setup();
		test3.testcanvas();
		test3.tearDown();*/
		/*MyTest4 test4 = new MyTest4();
		test4.setup();
		test4.testDrag();
		test4.tearDown();*/
		//MyTest5 test5 = new MyTest5();
		//test5.setup();
	}

}
