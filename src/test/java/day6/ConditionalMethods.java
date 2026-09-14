package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");

        WebElement element = driver.findElement(By.xpath("//h1[normalize-space()='Automation Testing Practice']"));
        boolean headingDisplay = element.isDisplayed();
        System.out.println("Heading is displayed: "+headingDisplay);

        boolean nameFieldStatus = driver.findElement(By.id("name")).isEnabled();
        System.out.println("Is Name Field enabled: "+nameFieldStatus);

        WebElement maleRadioBtn = driver.findElement(By.id("male"));
        System.out.println("Is Male radio button enabled: "+maleRadioBtn.isSelected());

        maleRadioBtn.click();
        System.out.println("Is Male radio button enabled: "+maleRadioBtn.isSelected());

        WebElement sundayCheckBox = driver.findElement(By.id("sunday"));
        System.out.println("Is sunday check box selected? "+sundayCheckBox.isSelected());

        sundayCheckBox.click();
        System.out.println("Is sunday check box selected? "+sundayCheckBox.isSelected());

    }

}
