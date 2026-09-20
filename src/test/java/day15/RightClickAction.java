package day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class RightClickAction {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement rightClickButton = driver.findElement(By.xpath("//p//span[text()='right click me']"));

        Actions act = new Actions(driver);

        act.contextClick(rightClickButton).perform();

        WebElement copyElement = driver.findElement(By.xpath("//span[text()='Copy']"));
        copyElement.click();

        driver.switchTo().alert().accept();


    }
}
