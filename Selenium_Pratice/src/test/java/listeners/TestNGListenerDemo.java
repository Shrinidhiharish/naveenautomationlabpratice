package listeners;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.TestNG_Listeners.class)
public class TestNGListenerDemo {
	@Test
public void test1()
{
	System.out.println("Iam inside test 1");
}
	@Test
public void test2()
{
	System.out.println("Iam inside test 2");
	 String projectpath = System.getProperty("user.dir"); 
     System.setProperty("webdriver.chrome.driver", projectpath+"\\Drivers\\Chromedriver\\chromedriver.exe");// can set the path to driver in environment variable
     WebDriver driver = new ChromeDriver();
     driver.get("http://google.com");
     driver.findElement(By.name("q")).sendKeys("make today amazing");
     driver.findElement(By.name("abc")).sendKeys(Keys.ENTER);
     driver.close();

}
	@Test
public void test3()
{
	System.out.println("Iam inside test 3 ");
	throw new SkipException("This test is skipped");
}
}
