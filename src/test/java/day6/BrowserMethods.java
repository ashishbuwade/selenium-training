package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/");

        Thread.sleep(5000);

        driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();

        Thread.sleep(5000);

//        driver.close();
        driver.quit();
    }

}
