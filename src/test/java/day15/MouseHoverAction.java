package day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class MouseHoverAction {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement pointMe = driver.findElement(By.xpath("//button[text()='Point Me']"));
        WebElement laptops = driver.findElement(By.xpath("//a[text()='Laptops']"));

        Actions act = new Actions(driver);

        act.moveToElement(pointMe).moveToElement(laptops).build().perform();

    }

}
