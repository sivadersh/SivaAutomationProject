package testpkg;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import basepkg.Baseclass;
import pagepkg.Jolly;
import utilities.Exceldata;

public class Testing extends Baseclass{
	
	@Test(priority = 1)
	public void scroll() throws Exception
	{
		Jolly jol=new Jolly(driver);
		jol.homescrolling();
	}
	@Test(priority = 2)
	public void pfile() throws Exception
	{
		Jolly jo = new Jolly(driver);
		jo.profilelogin();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		jo.loginbtn();
	}
	@Test(priority = 3)
	public void submission()
	{
		Jolly jo = new Jolly(driver);
		String Excel = "G:\\Projectjolly.xlsx";
		String Sheet = "Sheet1";
		int rowcount = Exceldata.getRowCount(Excel,Sheet);
        
        for (int i=1;i<=rowcount;i++)

        {
                    String Uname=Exceldata.getCellValue(Excel, Sheet, i, 0);
                    System.out.println("username---"+Uname);
                    String Pwd=Exceldata.getCellValue(Excel, Sheet, i, 1);
                    System.out.println("password---"+Pwd);
                    
                    jo.clearfield();
                    
                    jo.logincredentials(Uname, Pwd);  
                    
      			                    
        }
	}
	
	@Test(priority = 5)
	public void homepage() throws Exception
	{
		Jolly jo = new Jolly(driver);
		jo.homepage();
		Thread.sleep(2000);
		jo.silksaree();
		Thread.sleep(2000);
		jo.womanhover();
		Thread.sleep(2000);
		jo.offerhover();
		Thread.sleep(2000);
		jo.gifthover();
		Thread.sleep(2000);
		jo.offerhover();
		Thread.sleep(2000);
		jo.womansaree();
		Thread.sleep(1000);
	}
	
	@Test(priority = 6)
	public void filtering() throws Exception
	{
		Jolly jo = new Jolly(driver);
		jo.traditional();
		Thread.sleep(1000);
	}

	@Test(priority = 7)
	public void scrolling() throws Exception
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(1500);
		js.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(1500);
		js.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(1500);
		js.executeScript("window.scrollBy(0,100)", "");
	}
	
		
		@Test(priority = 8)
		public void addingwishlist() throws Exception
		{
			Jolly jo = new Jolly(driver);
		
		jo.wish();
		Thread.sleep(1500);
	}
	
	
	
	@Test(priority = 9)
	public void cart() throws Exception
	{
		Jolly jo = new Jolly(driver);
		jo.wbutton();
		Thread.sleep(2000);
		
	}
	@Test(priority = 10)
	public void cartbtn() throws Exception
	{
		Jolly jo = new Jolly(driver);
		
		Thread.sleep(1000);
		jo.addtocartbtn();
	}
	
	@Test(priority = 11)
	public void bagbtn() throws Exception
	{
		Jolly jo = new Jolly(driver);
		jo.bagbtn();
		Thread.sleep(2000);
		jo.proceed();
	}
	
	
		
	
	
	@Test(priority = 12)
	public void cout() throws Exception
	{
		Jolly j = new Jolly(driver);
		j.checkoutprocess();
		Thread.sleep(3000);
	}
	
	 @Test(priority = 13)    
	 public void clearingcart() throws Exception
	 {
		 Jolly jo = new Jolly(driver);
		 jo.bagbtn();
		 Thread.sleep(2000);
		 jo.removeaction();
	 }
	   

		@Test(priority = 14)
		public void lastprocess() throws Exception
		{
			
		Jolly jo = new Jolly(driver);
		jo.homepage();
		Thread.sleep(2000);
		           jo.profilelogin();
					Thread.sleep(2000);
					jo.signout();
					Thread.sleep(2000);
					jo.homepage();
					Thread.sleep(4000);
		
				
	}
	
	@Test(priority = 15)
	public void screensht() throws Exception
	{
		File screenshotFile = ((org.openqa.selenium.TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(screenshotFile, new File("E:\\screenshot.png"));
		}
	
	@Test(priority = 16)
	public void logocheck()
	{
		WebElement homeimg = driver.findElement(By.xpath("//*[@id=\"root\"]/main/header/div/div/div/nav/a/img"));
			Boolean b = homeimg.isDisplayed();
			if(b)
			{
				System.out.println("Logo is displayed");
			}
			else {
				System.out.println("Logo is not displayed");
			}
		}
	
	@Test(priority = 17)
	public void artsilk()
	{
		Jolly jo = new Jolly(driver);
		jo.art();
	}
	
		
	@Test(priority= 18)
	public void exit()
	{
		Jolly jo = new Jolly(driver);
		jo.close();
	}
	
	}

	
	
		
	
	
	

