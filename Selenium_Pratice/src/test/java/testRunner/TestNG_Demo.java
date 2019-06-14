package testRunner;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import configurations.PropertiesFile;
import demo.Log4jDemo;
import pageRepository.Google_Page;

public class TestNG_Demo 
{
        
		private static WebDriver driver = null;
		public static String browserName = null;
		
        
		private static Logger logger = LogManager.getLogger(Log4jDemo.class);
		
		@BeforeTest
		public void setupTest() throws IOException
		{
			PropertiesFile.getProperties();
			
			String projectpath = System.getProperty("user.dir"); 
			if(browserName.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", projectpath+"\\Drivers\\Chromedriver\\chromedriver.exe");// can set the path to driver in environment variable
				   driver= new ChromeDriver();
			}
			else if(browserName.equalsIgnoreCase("firefox"))
			{
				 System.setProperty("webdriver.gecko.driver", "E:\\Eclipse_Projects\\seleniumFramework\\Drivers\\Geckodriver\\geckodriver.exe");                
                 driver = new FirefoxDriver();
			}
		        
		}

		@Test
		public static void Google_Search()
		{
		        driver.get("http://google.com");
		        
		        Google_Page.textbox_Enter(driver).sendKeys("Make today amazing");
		        
		        
//		        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		        Google_Page.search_button(driver).sendKeys(Keys.ENTER);
		}

		@AfterTest
		public void tearDownTest() throws IOException
		{
		    driver.close();
		        System.out.println("Test Completed successfully");
		        PropertiesFile.setProperties();
		        driver.quit();

		}
		        
}
