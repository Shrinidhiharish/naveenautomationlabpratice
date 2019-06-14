package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitsDemo 
{
	public static void main(String[] args) {
		seleniumwait();
	}
public static void seleniumwait()
{

    String projectpath = System.getProperty("user.dir"); 
    System.setProperty("webdriver.chrome.driver", projectpath+"\\Drivers\\Chromedriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//default frequency or the pool time of implicit wait is 250 ms
	
	  driver.get("http://google.com");
	  driver.findElement(By.name("q")).sendKeys("java programs");
	  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	  
	  
	  WebDriverWait wait = new WebDriverWait(driver, 20);
	  WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.name("abc")));
	  
	  driver.findElement(By.name("abc")).click();
	  driver.close();
	  driver.quit();
	  
	
}
}
