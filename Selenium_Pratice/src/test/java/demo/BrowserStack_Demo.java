package demo;
import java.lang.*;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserStack_Demo {

        public static final String USERNAME = "shrinidhiharish1";
          public static final String AUTOMATE_KEY = "xf3DSxLTaG65TuE2fosu";
          public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

          public static void main(String[] args) throws Exception {

            DesiredCapabilities caps = new DesiredCapabilities();
   
            caps.setCapability("project", "demo");
            caps.setCapability("build", "build_1");
            caps.setCapability("browserstack.local", "false");
            caps.setCapability("browserstack.selenium_version", "3.5.2");

            caps.setCapability("browser", "Chrome");
            caps.setCapability("browser_version", "73.0");
            caps.setCapability("os", "Windows");
            caps.setCapability("os_version", "10");
            caps.setCapability("resolution", "1024x768");

            WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
            driver.get("http://www.google.com");
            WebElement element = driver.findElement(By.name("q"));

            element.sendKeys("BrowserStack");
            element.submit();

            System.out.println(driver.getTitle());
            driver.quit();

          }
}

