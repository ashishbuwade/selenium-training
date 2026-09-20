package day14;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DatePickerPractice2 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://testautomationpractice.blogspot.com/");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement datedrop = driver.findElement(By.xpath("//input[@placeholder='Start Date']"));
//        datedrop.click();
//        datedrop.sendKeys("25-05-2027");

        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].focus(); arguments[0].click();",datedrop);
//        js.executeScript("arguments[0].value = '30-08-2027';" + "arguments[0].dispatchEvent(new Event('change',{bubbles:true}))",datedrop);
        js.executeScript(
                "arguments[0].value = '2027-08-30';" +
                        "arguments[0].dispatchEvent(new Event('input', {bubbles:true}));" +
                        "arguments[0].dispatchEvent(new Event('change', {bubbles:true}));",
                datedrop
        );
//        new Actions(driver).moveToElement(datedrop).click().perform();
    }

}
