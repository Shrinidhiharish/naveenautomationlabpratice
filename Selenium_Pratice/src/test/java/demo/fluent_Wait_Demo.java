package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

//public class fluent_Wait_Demo {
//	static WebDriver driver;
//	public static void main(String[] args) {
//		demo();
		
//	}
//	public static void demo()
//	{
//		 // Waiting 30 seconds for an element to be present on the page, checking
		   // for its presence once every 5 seconds.
		//   Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS).(5, TimeUnit.SECONDS)
//		       .ignoring(NoSuchElementException.class);

//		   WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
//		     public WebElement apply(WebDriver driver) {
//		       return driver.findElement(By.id("foo"));
//		     }
//		   });
//	    String projectpath = System.getProperty("user.dir"); 
//	    System.setProperty("webdriver.chrome.driver", projectpath+"\\Drivers\\Chromedriver\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://google.com");
//		driver.findElement(By.name("q")).sendKeys("abcd");
//		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//		
//		
//	}
//}
