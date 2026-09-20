package day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DatePickerPractice {


    //Select Future Date
    static void selectFutureDate(WebDriver driver, String expYear, String expMonth, String expDate){

        while(true){

            String currYear = driver.findElement(By.className("ui-datepicker-year")).getText();
            String currMonth = driver.findElement(By.className("ui-datepicker-month")).getText();

            if(currYear.equals(expYear) && currMonth.equals(expMonth)){
                break;
            }

            driver.findElement(By.xpath("//a//span[text()='Next']")).click();

        }

        driver.findElement(By.xpath("//a[@data-date='"+expDate+"']")).click();

    }

    //Select Past Date
    static void selectPastDate(WebDriver driver, String expYear, String expMonth, String expDate){

        while(true){

            String currYear = driver.findElement(By.className("ui-datepicker-year")).getText();
            String currMonth = driver.findElement(By.className("ui-datepicker-month")).getText();

            if(currYear.equals(expYear) && currMonth.equals(expMonth)){
                break;
            }

            driver.findElement(By.xpath("//a//span[text()='Prev']")).click();

        }

        driver.findElement(By.xpath("//a[@data-date='"+expDate+"']")).click();

    }


    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.manage().window().maximize();

        driver.get("https://jqueryui.com/datepicker/");

        Thread.sleep(5000);

        driver.switchTo().frame(0);

        driver.findElement(By.xpath("//input[@id='datepicker']")).click();

        //Method 1 - Using Send Keys
//        driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("09/21/2026"); // MM/DD/YYYY


        //Method 2 - Using Date Picker

        //Expected Data

        String expYear = "1999";
        String expMonth = "May";
        String expDate = "25";

//        selectFutureDate(driver,expYear,expMonth,expDate);
        selectPastDate(driver,expYear,expMonth,expDate);

    }

}
