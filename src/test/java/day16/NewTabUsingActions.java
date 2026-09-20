package day16;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class NewTabUsingActions {

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement onlineTrainLink = driver.findElement(By.xpath("//a[text()='Online Trainings']"));

        Actions act = new Actions(driver);

        act.keyDown(Keys.CONTROL).click(onlineTrainLink).keyUp(Keys.CONTROL).perform();

//        act.keyDown(Keys.ALT).keyDown(Keys.TAB).keyUp(Keys.TAB).keyUp(Keys.ALT).perform();

        List<String> s = new ArrayList(driver.getWindowHandles());

        driver.switchTo().window(s.get(1));

        driver.findElement(By.xpath("//a[text()='Register']")).click();

        driver.switchTo().window(s.get(0));

        driver.findElement(By.id("name")).sendKeys("Dudu");

    }

}
