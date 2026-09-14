package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.util.Set;

public class GetMethods {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        //get(url) - opens the url on the browser
        driver.get("https://opensource-demo.orangehrmlive.com/");

        Thread.sleep(5000);

        //getTitle() - returns title of the page
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);

        //getCurrentUrl() - returns url of the page
        String pageURL = driver.getCurrentUrl();
        System.out.println(pageURL);

        //getPageSource() - returns source code of the page
        String pageSource = driver.getPageSource();
        System.out.println(pageSource);

        //getWindowHandle() - returns ID of the single browser window
        String windowId = driver.getWindowHandle();
        System.out.println(windowId);

        driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();

        //getWindowHandles() - returns ID's of the multiple browser windows
        Set<String> windowIds = driver.getWindowHandles();
        System.out.println(windowIds);


    }

}
