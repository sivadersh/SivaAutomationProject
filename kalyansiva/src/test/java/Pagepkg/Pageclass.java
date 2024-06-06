package Pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


	public class Pageclass {
		
		WebDriver driver;
		
		@FindBy(xpath = "//*[@id=\"__next\"]/div/div/header/div[2]/div[1]/div[1]/div/div/div[3]/a[1]")
		WebElement signin;
		
		@FindBy(xpath = "//*[@id=\"__next\"]/div/div/div[2]/div/div[1]/form/div[1]/div[1]/div/input")
		WebElement email;
		
		@FindBy(xpath = "//*[@id=\"__next\"]/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/input")
		WebElement passwordd;
		
		@FindBy(xpath = "//*[@id=\"__next\"]/div/div/div[2]/div/div[1]/form/div[3]/button")
		WebElement loginbtn;
		
		@FindBy(xpath = "//*[@id=\"__next\"]/div/div/header/div[2]/div[2]/div/div/div/div/div[1]/a[2]/div")
		WebElement womenhover;
		
		@FindBy(xpath = "//*[@id=\"__next\"]/div/div/header/div[2]/div[2]/div/div/div/div/div[1]/a[1]/div")
		WebElement sareetab;
		
		@FindBy(xpath = "//*[@id=\"__next\"]/div/div/header/div[2]/div[2]/div/div/div/div/div[1]/a[3]")
		WebElement men;
		
		@FindBy(xpath = "//*[@id=\"__next\"]/div/div/div[3]/div/div[2]/div/div[3]/div/div[1]/div/a/img")
		WebElement shirtimage;
		
		@FindBy(xpath = "//*[@id=\"__next\"]/div/div/div[2]/div/div[1]/div[2]/div[7]/div[1]/div/div/select")
		WebElement dropsize;
		
		@FindBy(xpath = "//*[@id=\"__next\"]/div/div/div[2]/div/div[1]/div[2]/div[8]/div[2]/button[1]")
		WebElement cart;
		
		@FindBy(xpath = "//*[@id=\"__next\"]/div/div/header/div[2]/div[1]/div[1]/div/div/div[3]/a/div[1]")
		WebElement cartview;
		
		@FindBy(xpath = "//*[@id=\"__next\"]/div/div/div[2]/div/div/div[1]/div[2]/div/div[2]/div[3]/button")
		WebElement checkout;
		
		@FindBy(xpath = "//*[@id=\"__next\"]/div/div/header/div[2]/div[2]/div/div/div/div/span/span/a/img")
        WebElement homelogo;
		
		@FindBy(xpath = "//*[@id=\"__next\"]/div/div/header/div[2]/div[1]/div[1]/div/div/div[3]/div")
		WebElement signout;
		
		@FindBy(xpath = "//*[@id=\"__next\"]/div/div/header/div[2]/div[1]/div[1]/div/div/div[3]/div/ul/li[4]")
		WebElement logoutbtn;
        
		
		
		public Pageclass(WebDriver driver) {
			
			this.driver = driver;
			PageFactory.initElements(driver, this);
			
		}
		

		public void signupp() {
			signin.click();
		}
		
		public void logindetails(String username, String password) {
			
			email.sendKeys(username);
			passwordd.sendKeys(password);
			loginbtn.click();
		}
		public void clearfield1() {
			email.clear();
			passwordd.clear();
		}
		public void sareemove()
		{
			Actions act = new Actions(driver);
			act.moveToElement(sareetab).perform();
		}
		public void womenmove() {
			
			Actions act = new Actions(driver);
			act.moveToElement(womenhover).perform();
			
			
		}
		public void menclick() {
			men.click();
			Actions act = new Actions(driver);
			act.moveToLocation(0, 250).perform();
			
			
		}
		public void menshirt() {
			
			shirtimage.click();
		}
        public void dropaction() {
			
			Select s = new Select(dropsize);
			s.selectByIndex(3);
}
         public void cartclick() {
	
	     cart.click();
	}
         public void cartviewer() {
        		
	     cartview.click();
	}
         public void proceedcheckout()
         {
     		
    	     checkout.click();
    	}
         public void backmoving()
         {
     		
    	     homelogo.click();
    	}
         public void signoutclick()
         {
     		
    	     signout.click();
    	}
         public void logout()
         {
        	 logoutbtn.click();
         }
	}
