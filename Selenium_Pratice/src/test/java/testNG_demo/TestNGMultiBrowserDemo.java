package testNG_demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGMultiBrowserDemo 
{
	WebDriver driver = null;
	String projectpath = System.getProperty("user.dir"); 
@Parameters("browserName")	
@BeforeTest
public void setup(String browserName)
{
	System.out.println("Browser name is :" +browserName);
System.out.println("Thread id : " +Thread.currentThread().getId());
	if(browserName.equalsIgnoreCase("chrome"))
	{
	     System.setProperty("webdriver.chrome.driver", projectpath+"\\Drivers\\Chromedriver\\chromedriver.exe");// can set the path to driver in environment variable
	     driver = new ChromeDriver();
	}
	else if(browserName.equalsIgnoreCase("firefox"))
	{
		 
		  System.setProperty("webdriver.gecko.driver", "E:\\Eclipse_Projects\\seleniumFramework\\Drivers\\Geckodriver\\geckodriver.exe");                
         driver = new FirefoxDriver();
	      
	}
	else if(browserName.equalsIgnoreCase("internet explorer"))
	{
		 System.setProperty("webdriver.ie.driver", projectpath+"\\Drivers\\IdEDriver\\IEDriverServer.exe");// can set the path to driver in environment variable
	     driver = new InternetExplorerDriver();
	}
	}
@Test
public void test1() throws InterruptedException 
{
	driver.get("http://google.com");
	Thread.sleep(2000);
}
@AfterTest
public void teardown()
{
	driver.close();
	System.out.println("Test successfully completed");
}
}
