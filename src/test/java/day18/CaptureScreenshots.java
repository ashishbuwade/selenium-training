package day18;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.time.Duration;

public class CaptureScreenshots {

    public static void main(String[] args) throws IOException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://testautomationpractice.blogspot.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.manage().window().maximize();

        //1. Full Page Screenshot
/*
        TakesScreenshot ts = (TakesScreenshot) driver;
        File sourceFile = ts.getScreenshotAs(OutputType.FILE);
        File targetFile = new File(System.getProperty("user.dir")+"\\screenshots\\ss1.png");
//        sourceFile.renameTo(targetFile);
        Files.copy(sourceFile.toPath(),targetFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
        System.out.println("Screenshot done");
*/

        //2. Capture the screenshot of specific section
/*
        WebElement sideBar = driver.findElement(By.id("sidebar-right-1"));
        File sourceFile = sideBar.getScreenshotAs(OutputType.FILE);
        File targetFile = new File(System.getProperty("user.dir")+"\\screenshots\\ss2.png");
        Files.copy(sourceFile.toPath(),targetFile.toPath(),StandardCopyOption.REPLACE_EXISTING);
*/

    //3. Capture the screenshot of webelement
        WebElement logo = driver.findElement(By.xpath("//button[text()='Point Me']"));

        File sourceFile = logo.getScreenshotAs(OutputType.FILE);
        File targetFile = new File(System.getProperty("user.dir")+"\\screenshots\\logo.png");
        Files.copy(sourceFile.toPath(),targetFile.toPath(),StandardCopyOption.REPLACE_EXISTING);


    }

}
