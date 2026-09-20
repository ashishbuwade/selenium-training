package day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ActionsVSAction{

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement source = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
        WebElement target = driver.findElement(By.xpath("//p[text()='Drop here']"));


        Actions act = new Actions(driver);

        Action  sourceAct = act.dragAndDrop(source,target).build();

        sourceAct.perform();

    }

 }
