package firstSeleniumScript;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WorkingWithChrome {
	
	ChromeDriver driver;
	
	String url = "http://www.facebook.com";
	
	public void invokeBrowser() {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ktenn\\eclipse-workspace\\TestAutomation\\drivers\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Users\\ktenn\\Downloads\\Compressed\\chrome-win64\\chrome.exe");
		
		driver = new ChromeDriver(options);
		
		
		driver.manage().window().maximize();
		
		driver.get(url);
	}
	
	//close the browser
	public void closeBrowser() {
		
		//driver.close(); // to close current active window
		
		driver.quit(); // to close all the windows
	}
	
	
	public static void main(String[] args) {
	
		WorkingWithChrome wc = new WorkingWithChrome();
	
		wc.invokeBrowser();
		wc.closeBrowser();
		
	}

}
