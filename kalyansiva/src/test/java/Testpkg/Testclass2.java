package Testpkg;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Basepkg.Baseclass;
import Pagepkg.Pageclass;

import util.Exdata;


public class Testclass2 extends Baseclass {
		
		@Test(priority =1)
		public void signclicking() throws Exception{
			Pageclass ob = new Pageclass(driver);
			ob.signupp();
			
		}
		@Test(priority = 2)
		public void submission()
		{
			Pageclass ob = new Pageclass(driver);
			String Excel = "G:\\kalyansilks.xlsx";
			String Sheet = "Sheet1";
			int rowcount = Exdata.getRowCount(Excel,Sheet);
	        
	        for (int i=1;i<=rowcount;i++)

	        {
	                    String username=Exdata.getCellValue(Excel, Sheet, i, 0);
	                    System.out.println("username---"+username);
	                    String password=Exdata.getCellValue(Excel, Sheet, i, 1);
	                    System.out.println("password---"+password);
	                    
	                   
	                    
	                    ob.logindetails(username, password);  
	                    
	                   Pageclass p = new Pageclass(driver);
	                   p.clearfield1();
	        }   
		}
	      			                    
		
	        @Test(priority =3)
			public void mousehoverwomen() throws Exception{
				Pageclass ob = new Pageclass(driver);
				ob.sareemove();
				Thread.sleep(2000);
				ob.womenmove();
				Thread.sleep(2000);
	}
		@Test(priority =4)
		public void menselection() throws Exception {
			Pageclass ob = new Pageclass(driver);
			
			ob.menclick();
			Thread.sleep(2000);
}
		@Test(priority =5)
		public void menshirtselection() throws Exception {
			Pageclass ob = new Pageclass(driver);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,300)", "");
			ob.menshirt();
			Thread.sleep(2000);
			ob.dropaction();
			ob.cartclick();
			Thread.sleep(2000);
			ob.cartviewer();
			Thread.sleep(2000);
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			js1.executeScript("window.scrollBy(0,300)", "");
			Thread.sleep(2000);
			Actions act = new Actions(driver);
			act.moveToLocation(0, 350).perform();
			Thread.sleep(2000);
			ob.proceedcheckout();
			Thread.sleep(2000);
			
		}
		@Test(priority = 6)
		public void logo()
		{
			Pageclass ob = new Pageclass(driver);
			ob.backmoving();
		}
		@Test(priority = 7)
		public void signoutclicks() throws Exception
		{
			Pageclass ob = new Pageclass(driver);
			ob.signoutclick();
			Thread.sleep(2000);
			ob.logout();
			Thread.sleep(2000);
			ob.backmoving();
		}
}



