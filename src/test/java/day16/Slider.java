package day16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Slider {

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        Actions act = new Actions(driver);

        //Min Slider
        WebElement minSlider = driver.findElement(By.xpath("//div[@id='slider-range']//span[1]")); //(59, 247)
        System.out.println("Default Min Slider Value: "+minSlider.getLocation());
        act.dragAndDropBy(minSlider,100,247).perform();
        System.out.println("Min Slider Value after dragging: "+minSlider.getLocation());

        //Max Slider
        WebElement maxSlider = driver.findElement(By.xpath("//div[@id='slider-range']//span[2]")); //(545, 247)
        System.out.println("Default Max Slider Value: "+maxSlider.getLocation());
        act.dragAndDropBy(maxSlider,-100,247).perform();
        System.out.println("Max Slider Value after dragging: "+maxSlider.getLocation());

    }

}
