package ShoperpagePKG;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageClass {

	 WebDriver driver;
	   
	   By logo=By.xpath("/html/body/main/header/div[1]/div/div[1]/div[2]/a/img[1]");
	   
	   By cate=By.xpath("/html/body/main/header/nav/div[1]/div/ul[1]/li[1]/a");
	   
	   By kids=By.xpath("/html/body/main/header/nav/div[1]/div/ul[2]/li[7]/a");
	   
	   By search=By.xpath("//*[@id=\"js-site-search-input\"]");
	   
	   By searchnclick=By.xpath("//*[@id=\"search_form_SearchBox\"]/div/input[2]");
	   
	   By bag=By.xpath("/html/body/main/header/div[1]/div/div[2]/div[2]/ul/li[3]/a/i");
	 
	   By countn=By.xpath("/html/body/main/div[18]/section/div/div[2]/div/div/div[2]/div/ul/li/a");
	   
	   By men=By.xpath("/html/body/main/header/nav/div[1]/div/ul[2]/li[3]/a");
	   
	   By links=By.tagName("a");
	  
	   
	   public PageClass(WebDriver driver)
	   {
		   this.driver=driver;
	   }
	 //logo present
	   
	   public void logopresent()
	   {
		   if(driver.findElement(logo).isDisplayed())
		   {
			   System.out.println("logo is present");
		   }
		   else
		   {
			   System.out.println("logo is not present");
		   }
	   }
	   // click category
	   public void category()
	   {
		   driver.findElement(cate).click();
	   }
	   // click kidss
	   public void kidss()
	   {
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   driver.findElement(kids).click();
	   }
	   //search
	   public void seacrchng()
	   {
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   driver.findElement(search).sendKeys("skirt");
		   driver.findElement(searchnclick).click();
		
	   }
	    //view cart
	   public void clickbag()
	   {
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   driver.findElement(bag).click();
	   }

	   public void clickcountinue()
	   {
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   driver.findElement(countn).click();
	   }
	     //   mouseover
	   
	   public void clickmen()
	   {
		           // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		    Actions act=new Actions(driver);
		    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		    WebElement w=driver.findElement(men);
		    wait.until(ExpectedConditions.visibilityOf(w));
		    act.moveToElement(w).perform();
		   
		 
		    
	   }
	 //links
	   public void linktest()
	   {
		   List<WebElement>list=driver.findElements(links);
			for(WebElement w:list)
			{
				String s=w.getAttribute("href");
				String s1=w.getText();
				System.out.println("link "+s+"text "+s1);
			}  
	   }

}
