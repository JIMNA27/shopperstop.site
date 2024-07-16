package ShopertestPKG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ShoperpagePKG.PageClass;


public class TestClass {

	 WebDriver driver;
	    
	  @BeforeTest
	 public void set()
	 {
		  driver=new ChromeDriver();
	 }
	  @BeforeMethod
	  public void url()
	  {
		  driver.manage().window().maximize();
		  driver.get("https://www.shoppersstop.com/");
	  }
	  @Test
	  public void test()
	  {
		PageClass obj=new PageClass(driver);
		  obj.logopresent();
		  
		  obj.category();
		  
		  obj.kidss();
		  
		  obj.seacrchng();
		  
		  obj.clickbag();
		  
		  obj.clickcountinue();
		  
		  obj.clickmen();
		  
		  obj.linktest();
		 
	  }
	
}
