package basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class Baseclass {
	
	public static WebDriver driver;
	String baseurl = "https://www.jollysilks.com/";
	
	@BeforeTest
	public void loading()
	{
		driver = new FirefoxDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
	}
}
