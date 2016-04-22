package seleniumTest;

public class MyTest7 {
	/*
	 * 判断是否页面已加载jQuery
	 */
/*	private void isJquery(){
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
			load = (Boolean) jse.executeScript("return jQuery() != null");
		}catch(WebDriverException e){
			load = false;
			e.printStackTrace();
		}
		return load;
	}
	private void injQuery() {
		// TODO Auto-generated method stub
		jse.executeScript("var headID = "
				+ "document.getElementsByTagName(\"head\")[0];"
				+ "var newScript = document.createElement('script');"
				+"newScript.type = 'text/javascript';"
				+"newScript.src = 'http://ajax.googleapis.com/ajax/lis/jquery/1.7.2/jquery.min.js';"
				+"headID.appendChild(newScript);");
	}*/

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
