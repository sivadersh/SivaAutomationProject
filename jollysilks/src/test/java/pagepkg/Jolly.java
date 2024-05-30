package pagepkg;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Jolly {

	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/ul[2]/li[2]/a/span")
	WebElement profile;
	
	@FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/ul[2]/li[2]/ul/li[1]/a/span")
	WebElement login;
	
	@FindBy(xpath = "//*[@id=\"root\"]/main/div[1]/div/div/div/form/div[1]/div/span/span[1]/input")
	WebElement email;
	
	@FindBy(xpath = "//*[@id=\"root\"]/main/div[1]/div/div/div/form/div[2]/div/span/span[1]/input")
	WebElement pass;
	
	@FindBy(xpath = "//*[@id=\"root\"]/main/div[1]/div/div/div/form/div[5]/button[1]/span")
	WebElement submit;
	
	
	
	@FindBy(xpath = "//*[@id=\"root\"]/main/header/div/div/div/nav/a/img")
	WebElement home1;
	
	@FindBy(xpath = "//*[@id=\"root\"]/main/header/div/div/div/nav/a/img")
	WebElement home;
	
	@FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/ul[1]/li[1]/a")
	WebElement silk;
	
	@FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/ul[1]/li[2]/a")
	WebElement woman;
	
	@FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/ul[1]/li[3]/a")
	WebElement offerbtn;
	
	@FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/ul[1]/li[4]/a")
	WebElement giftbtn;
	
	@FindBy(xpath = "//*[@id=\"root\"]/main/div[1]/div/div/div[5]/div[2]/section/div[1]/div[1]/div[1]/div/div[1]/a/div/picture/img")
	WebElement item;
	
	
	@FindBy(xpath = "//*[@id=\"root\"]/main/div[1]/div/div/div[4]/div[1]/div/div/ul/li[1]/form/ul[1]/li[3]")
	WebElement keralatraditional;
	
	@FindBy(xpath = "//*[@id=\"root\"]/main/div[1]/div/div/div[4]/div[1]/div/div/ul/li[2]/form/ul[1]/li[1]")
	WebElement price;
	
	@FindBy(xpath = "//*[@id=\"root\"]/main/div[1]/div/div/div[4]/div[2]/section/div[1]/div[1]/div[8]/div/div[1]/button")
	WebElement wishlist;
	
	@FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/ul[2]/li[3]")
	WebElement wishbtn;
	
	@FindBy(xpath = "//*[@id=\"root\"]/main/div[1]/div/div[2]/div[2]/div/div/div/ul/li[1]/div/div[2]/div/div/div[2]/ul/li[2]/button")
	WebElement addtocart;
	
	@FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/ul[2]/li[4]/button")
	WebElement bag;
	
	@FindBy(xpath = "//*[@id=\"root\"]/main/div[1]/div[1]/div/div/div/div[2]/div/div[3]/div/div[3]/button")
	WebElement continuebtn;
	
	@FindBy(name = "firstname")
	WebElement fname;
	
	@FindBy(name = "lastname")
	WebElement lname;
	
	@FindBy(name = "telephone")
	WebElement mobile;
	
	@FindBy(name = "postcode")
	WebElement pin;
	
	@FindBy(xpath = "//*[@id=\"street_0\"]")
	WebElement address;
	
	@FindBy(xpath = "//*[@id=\"street_1\"]")
	WebElement town;
	
	@FindBy(name = "city")
	WebElement city;
	
	@FindBy(xpath = "//*[@id=\"region_code\"]")
	WebElement state;
	
	@FindBy(xpath = "//*[@id=\"root\"]/main/div[1]/div[1]/div/div/div/div[1]/div/div[2]/form/div[1]/div[8]/div/div/label[1]/input")
	WebElement radio;
	
	@FindBy(xpath = "//*[@id=\"root\"]/main/div[1]/div[1]/div/div/div/div[1]/div/div[2]/form/div[2]/div[1]/button")
	WebElement addaddress;
	
	@FindBy(xpath = "//*[@id=\"root\"]/main/div[1]/div[1]/div/div/div/div[1]/div/div[2]/div/div/div[2]/div/div/div/form/div/label/input")
	WebElement selectadd;
	
	@FindBy(xpath = "//*[@id=\"root\"]/main/div[1]/div[1]/div/div/div/div[2]/div/div[2]/div/div[3]/button")
	WebElement checkout;
	
	@FindBy(xpath = "//*[@id=\"root\"]/main/div[1]/div[1]/div/div/div/div[1]/div/div[2]/ul/li/div/div[2]/ul/li[1]/button")
	WebElement remove;
	
	@FindBy(xpath = "/html/body/div/main/div[1]/div[2]/div/div/div/div/a[4]/h3")
	WebElement artbtn;
	
	
	@FindBy(xpath  = "//*[@id=\"navbarSupportedContent\"]/ul[2]/li[2]/ul/li[7]/button")
	WebElement signoutbtn;
	
	@FindBy(xpath = "//*[@id=\"root\"]/main/div[1]/div[1]/div/div/div/div[1]/div/div[2]/ul/li/div/div[2]/div/div[1]/a")
	WebElement selectedproduct;
	
	
	
	public Jolly(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void profilelogin()
	{
		profile.click();
	}
	
	public void  loginbtn()
	{
		login.click();
	}
	
	public void logincredentials(String emailid, String password)
	{
		
		email.sendKeys(emailid);
		pass.sendKeys(password);
		submit.click();
		
	}
	
	public void clearfield()
	{
		email.clear();
		pass.clear();
	}
	
	
	public void homepage()
	{
		home1.click();
	}
	
	public void silksaree()
	{
		Actions act = new Actions(driver);
		act.moveToElement(silk).perform();
	}
	
	public void womanhover()
	{
		Actions a = new Actions(driver);
		a.moveToElement(woman).perform();
	}
	 public void offerhover()
	 {
		 Actions ac = new Actions(driver);
		 ac.moveToElement(offerbtn).perform();
	 }
	 
	 public void gifthover()
	 {
		 Actions act = new Actions(driver);
		 act.moveToElement(giftbtn).perform();
	 }
	public void womansaree() throws Exception
	{
		woman.click();
		Thread.sleep(1500);
			Actions act = new Actions(driver);
			act.moveToLocation(0, 110).perform();
		
	}
	public void traditional() throws Exception
	{
		keralatraditional.click();
		Thread.sleep(2000);
		price.click();
		Thread.sleep(2000);
	}
	
	public void wish() throws Exception
	{
		wishlist.click();
		Thread.sleep(2000);
	}
	
	public void wbutton() throws Exception
	{
		wishbtn.click();
		Thread.sleep(2000);
	}
	public void addtocartbtn() throws Exception
	{
		addtocart.click();
		Thread.sleep(2000);
	}
	public void bagbtn()
	{
		bag.click();
	}
	
	public void proceed()
	{
		continuebtn.click();
	}
	
	public void contact()
	{
		fname.sendKeys("Praveen");
		lname.sendKeys("R");
		mobile.sendKeys("8075851524");
		pin.sendKeys("682021");
		address.sendKeys("White House, Amaravathy");
		town.sendKeys("FortKochi");
		city.sendKeys("Ernakulam");
		Select s = new Select(state);
		s.selectByIndex(18);
		radio.click();
		addaddress.click();
	}
	
	public void checkoutprocess() throws Exception
	{
		selectadd.click();
		Thread.sleep(3000);
		checkout.click();
	}
	
	public void removeaction()
	{
		remove.click();
	}
	
	
	public void signout()
	{
		signoutbtn.click();
	}
	
	public void art()
	{
		
		String arttext = artbtn.getText();
		System.out.println("Extracted text ---> "+ arttext);
	}
	
	public void selected()
	{
		String favproduct = selectedproduct.getText();
		System.out.println("Selected product  --->"+favproduct);
	}
	
	public void close()
	{
		driver.close();
	}
	
	
}
