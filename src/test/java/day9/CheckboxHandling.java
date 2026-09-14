package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckboxHandling {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://testautomationpractice.blogspot.com/");

        driver.manage().window().maximize();

        //Checked single checkbox
//        driver.findElement(By.id("sunday")).click();

        //Checked multiple checkbox
//        List<WebElement> weekDays = driver.findElements(By.xpath("//input[@class='form-check-input' and @type = 'checkbox']"));
//        for(int i=0;i<weekDays.size();i++){
//            weekDays.get(i).click();
//        }

//        for(WebElement weekDay : weekDays){
//            weekDay.click();
//        }

        //Select first 3 chekboxes
//        List<WebElement> weekDays= driver.findElements(By.xpath("//input[@class='form-check-input' and @type = 'checkbox']"));
//
//        for(int i=0;i<3;i++){
//            weekDays.get(i).click();
//        }

        //Select last 3 chekboxes
        List<WebElement> weekDays= driver.findElements(By.xpath("//input[@class='form-check-input' and @type = 'checkbox']"));

        for(int i=weekDays.size()-3;i<weekDays.size();i++){
            weekDays.get(i).click();
        }

        Thread.sleep(5000);
        for(int i = 0;i<weekDays.size();i++){
            if(weekDays.get(i).isSelected()){
                weekDays.get(i).click();
            }
        }

    }

}
