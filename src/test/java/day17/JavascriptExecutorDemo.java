package day17;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class JavascriptExecutorDemo {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://testautomationpractice.blogspot.com/");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000L));

        WebElement nameInput =  driver.findElement(By.id("name"));

        JavascriptExecutor js = (JavascriptExecutor)driver;

        //Passing the text into input box
        js.executeScript("arguments[0].setAttribute('value','John')",nameInput);

        WebElement maleRadio = driver.findElement(By.id("male"));

        //Clicking on element
        js.executeScript("arguments[0].click()",maleRadio);

    }

}
