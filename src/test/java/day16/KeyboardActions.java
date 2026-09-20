package day16;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class KeyboardActions {

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();

        driver.get("https://text-compare.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("I'm a SDET Engineer");

        Actions act = new Actions(driver);

        //Select the text area and copy the text
        act.keyDown(Keys.CONTROL).sendKeys("A").sendKeys("C").keyUp(Keys.CONTROL).perform();

        //Move to the next tab
        act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();

        //Paste the copied text into next tab
        act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();

    }
}
