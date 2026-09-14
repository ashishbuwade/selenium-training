import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Day11 {

    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        WebElement countryDropDown = driver.findElement(By.xpath("//select[@id='country']"));

        Select selectDropDown = new Select(countryDropDown);
//        selectDropDown.selectByVisibleText("Canada");
//        selectDropDown.selectByValue("uk");
//        selectDropDown.selectByIndex(5);

        List<WebElement> countryOptions = selectDropDown.getOptions();

        for(int i = 0;i<countryOptions.size();i++){
            System.out.println(countryOptions.get(i).getText());
        }


    }
}
