package testproject.testproject.sonar;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Sonar {
		public static void main(String[] args) {
	    	System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			//comment the above 2 lines and uncomment below 2 lines to use Chrome
			//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
			//WebDriver driver = new ChromeDriver();
	    	
	        String baseUrl = "http://demo.guru99.com/test/newtours/";
	       

	        // launch Fire fox and direct it to the Base URL
	        driver.get(baseUrl);
		}

		

	
 public void tester()
 {
	 int a =2;
	
 }
}

