package Basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class Baseclass {
public static WebDriver driver;
String url = "https://kalyansilks.com/";

@BeforeTest
public void setup()
{
	driver = new FirefoxDriver();
	driver.get(url);
	//WebElement notificationButton = driver.findElement(By.id("notificationButton"));
    //notificationButton.click();

	driver.manage().window().maximize();
}
}
