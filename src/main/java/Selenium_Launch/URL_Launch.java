package Selenium_Launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class URL_Launch {

	public static void main( String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.co.in");
		System.out.println(driver.getTitle());
	}
	
}
