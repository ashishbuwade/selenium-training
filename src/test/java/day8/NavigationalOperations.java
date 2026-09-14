package day8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class NavigationalOperations {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        WebDriver driver = new ChromeDriver();
//        driver.get("https://opensource-demo.orangehrmlive.com/");
//        driver.navigate().to("https://testautomationpractice.blogspot.com/");

//        URL url = new URL("https://testautomationpractice.blogspot.com/");
//        driver.navigate().to(url);

        driver.get("https://opensource-demo.orangehrmlive.com/");
        System.out.println(driver.getCurrentUrl());
        driver.navigate().to("https://testautomationpractice.blogspot.com/");
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(5000);

        System.out.println(driver.getCurrentUrl());
        driver.navigate().forward();
        Thread.sleep(5000);

        System.out.println(driver.getCurrentUrl());

        driver.navigate().refresh();


    }

}
