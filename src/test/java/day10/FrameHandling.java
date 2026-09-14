package day10;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://ui.vision/demo/webtest/frames/");

        driver.manage().window().maximize();

        //Frame 1
        WebElement frame1 = driver.findElement(By.cssSelector("frame[src='frame_1.html']"));
        driver.switchTo().frame(frame1);

        driver.findElement(By.cssSelector("input[name='mytext1']")).sendKeys("Selenium");

        driver.switchTo().defaultContent();

        //Frame 2
        WebElement frame2 = driver.findElement(By.cssSelector("frame[src='frame_2.html']"));
        driver.switchTo().frame(frame2);

        driver.findElement(By.name("mytext2")).sendKeys("Java");

        driver.switchTo().defaultContent();

        //Frame 3
        WebElement frame3 = driver.findElement(By.cssSelector("frame[src='frame_3.html']"));
        driver.switchTo().frame(frame3);

        //inner frame under Frame 3
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//div[@id='i21']//div[@class='uHMk6b fsHoPb']")).click();

        driver.switchTo().defaultContent();

    }

}
