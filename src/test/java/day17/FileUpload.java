package day17;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FileUpload {

    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.manage().window().maximize();

        JavascriptExecutor js = driver;

        //Single File Upload - Test1.txt

        driver.findElement(By.id("singleFileInput")).sendKeys("C:\\Users\\ashis\\OneDrive\\Desktop\\New folder\\SeleniumDocx\\Text1.txt");

        //Multiple FIle Upload - Test1.txt, Test2.txt

        String file1 = "C:\\Users\\ashis\\OneDrive\\Desktop\\New folder\\SeleniumDocx//text1.txt";
        String file2 = "C:\\Users\\ashis\\OneDrive\\Desktop\\New folder\\SeleniumDocx//text2.txt";
        driver.findElement(By.id("multipleFilesInput")).sendKeys(file1+"\n"+ file2);



    }

}
