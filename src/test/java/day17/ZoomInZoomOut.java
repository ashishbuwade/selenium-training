package day17;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ZoomInZoomOut {

    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.manage().window().maximize();

        JavascriptExecutor js = driver;

        Thread.sleep(2000L);
        js.executeScript("document.body.style.zoom = '50%'");
        Thread.sleep(2000L);
        js.executeScript("document.body.style.zoom = '150%'");


    }



}
