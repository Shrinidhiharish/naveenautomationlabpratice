package demo;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windows {

        public static void main (String []args) {
                
                System.setProperty("webdriver.chrome.driver", "./Drivers/Chromedriver/chromedriver.exe");
                WebDriver d = new ChromeDriver();
                d.get("https://www.makemytrip.com");
                d.findElement(By.xpath("//label[@for='departure']")).click();
                Boolean flag = d.findElement(By.xpath("//div[@class='DayPicker-Month']/div[1]/div[1]")).getText().contains("August 2019");
                while(!flag);
                {
                        System.out.println("In while");
                        d.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
                }
                List<WebElement> day = d.findElements(By.xpath("//div[@role='gridcell']"));
                
                int count = day.size();
                System.out.println(count);
                for(int i=0;i<count;i++)
                {
                        String text = day.get(i).getAttribute("aria-label");
                        System.out.println(text);
                        if(text.equalsIgnoreCase("Thu Aug 15 2019"))
                        {
                                day.get(i).click();
                                break;
                        }
                }
        }
}
