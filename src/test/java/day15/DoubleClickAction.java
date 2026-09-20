package day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DoubleClickAction {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement inputBox1 = driver.findElement(By.xpath("//input[@id='field1']"));
        WebElement inputBox2 = driver.findElement(By.xpath("//input[@id='field2']"));
        WebElement copyTextButton = driver.findElement(By.xpath("//button[text()='Copy Text']"));

        inputBox1.clear();
        inputBox1.sendKeys("AB");

        Actions act = new Actions(driver);

        act.doubleClick(copyTextButton).perform();

        String text1 = inputBox1.getText();
        String text2 = inputBox2.getText();

        if(text1.equals(text2)){
            System.out.println("Text Copied...");
        }else{
            System.out.println("Text not copied...");
        }


    }

}
