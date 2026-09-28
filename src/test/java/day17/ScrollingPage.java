package day17;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ScrollingPage {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.manage().window().maximize();

        JavascriptExecutor js = driver;


        // 1. Scroll down page by pixel number
        js.executeScript("window.scrollBy(0,1500)","");
        System.out.println(js.executeScript("return window.pageXOffset;"));
        System.out.println(js.executeScript("return window.pageYOffset;"));

        Thread.sleep(5000L);

        // 2. Scroll the page till element is visible
        WebElement staticWebTable = driver.findElement(By.xpath("//h2[text()='Static Web Table']"));
        js.executeScript("arguments[0].scrollIntoView();",staticWebTable);
        System.out.println(js.executeScript("return window.pageXOffset;"));
        System.out.println(js.executeScript("return window.pageYOffset;"));

        Thread.sleep(5000L);

        // 3. Scroll Page till end of the page
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        System.out.println(js.executeScript("return window.pageXOffset;"));
        System.out.println(js.executeScript("return window.pageYOffset;"));

        Thread.sleep(5000L);

        js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
        System.out.println(js.executeScript("return window.pageXOffset;"));
        System.out.println(js.executeScript("return window.pageYOffset;"));
    }

}
