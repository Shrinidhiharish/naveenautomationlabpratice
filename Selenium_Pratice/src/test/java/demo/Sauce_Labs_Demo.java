package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.Assert;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;

public class Sauce_Labs_Demo {
        private static WebDriver driver;
        public static final String sauceUserName = "shrinidhi";
        public static final   String sauceAccessKey = "005bdda7-4e3b-4972-9598-13db270b638a";

        public static void main(String[] args) throws MalformedURLException {

                DesiredCapabilities capabilities = new DesiredCapabilities();

                //set your user name and access key to run tests in Sauce
                capabilities.setCapability("username", sauceUserName);

                //set your sauce labs access key
                capabilities.setCapability("accessKey", sauceAccessKey);

                //set browser to chrome
                capabilities.setCapability("browserName", "Chrome");

                //set operating system to macOS version 10.13
                capabilities.setCapability("platform", "Windows 10");

                //set the browser version to 11.1
                capabilities.setCapability("version", "latest");


                //set your test case name so that it shows up in Sauce Labs
                capabilities.setCapability("name", "1-first-test");


                driver = new RemoteWebDriver(new URL("http://ondemand.saucelabs.com:80/wd/hub"), capabilities);
                //                String projectpath = System.getProperty("user.dir"); 
                //                        System.setProperty("webdriver.chrome.driver", projectpath+"\\Drivers\\Chromedriver\\chromedriver.exe");
                //                        WebDriver driver = new ChromeDriver();

                driver.get("http://google.com");
                System.out.println(driver.getTitle());
                driver.findElement(By.name("q")).sendKeys("make today amazing");
                driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
                System.out.println(driver.getTitle());


                driver.quit();
                System.out.println("Test completed");
        }
}
