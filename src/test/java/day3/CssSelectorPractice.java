package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorPractice {

    public static void main(String[] args) {

        //Lauch the chrome browser
        WebDriver driver = new ChromeDriver();

        //Open the URL
        driver.get("https://testautomationpractice.blogspot.com/");

        // Maximize the window
        driver.manage().window().maximize();

        // Tag Id: tag#id or #id
//        driver.findElement(By.cssSelector("input#name")).sendKeys("Dudu");
        driver.findElement(By.cssSelector("#name")).sendKeys("Dudu King");

        // Tag Class: tag.classname or .classname
//        driver.findElement(By.cssSelector("input.wikipedia-search-input")).sendKeys("Who is Bubu");
        driver.findElement(By.cssSelector(".wikipedia-search-input")).sendKeys("Who is Bubu Rani");

        // Tag Attribute: tag[attribute="value"] or [attribute="value"]
        driver.findElement(By.cssSelector("input[placeholder=\"Enter EMail\"]")).sendKeys("d@k.com");
//        driver.findElement(By.cssSelector("input[placeholder='Enter EMail'")).sendKeys("d@k.com");
//        driver.findElement(By.cssSelector("[placeholder='Enter EMail'")).sendKeys("b@k.com");

        // Tag Class Attribute: tag.classname[attribute="value"] or .classname[attribute="value"]
//        driver.findElement(By.cssSelector("input.form-control[placeholder=\"Enter Phone\"]")).sendKeys("12345");
        driver.findElement(By.cssSelector("input.form-control[placeholder=\"Enter Phone\"]")).sendKeys("12345");

    }

}
